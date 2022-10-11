package com.InterviewCode.TheDarkTower.palindrome.repositories;

import com.InterviewCode.TheDarkTower.palindrome.objects.Palindrome;
import io.vavr.collection.List;
import org.jdbi.v3.core.Jdbi;
import org.jdbi.v3.core.statement.StatementContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.sql.ResultSet;
import java.sql.SQLException;

import static com.InterviewCode.TheDarkTower.palindrome.PostgresConstants.*;

@Repository
@Transactional
public class JdbiPalindromeRepository implements  PalindromeRepository{

    private static final String ALL_COLUMNS = WORD_COLUMN + ", " + DEFINITION_COLUMN;

    private final Jdbi jdbi;

    JdbiPalindromeRepository(Jdbi jdbi) {
        this.jdbi = jdbi;
    }

    private static final String SELECT_ALL_WORDS_SQL =
            "SELECT " + ALL_COLUMNS + " " +
            "FROM " + WORD_TABLE;

    @Override
    public List<Palindrome> getAll() {
        return jdbi.withHandle(handle -> handle.createQuery(SELECT_ALL_WORDS_SQL)
            .map(this::palindromeRowMapper)
            .collect(List.collector()));
    }

    private static final String UPSERT_WORD_SQL =
            "INSERT INTO " + WORD_TABLE + "(" +ALL_COLUMNS + ")" +
            "VALUES (:" + WORD_COLUMN + ", :" + DEFINITION_COLUMN + ")" +
            "ON CONFLICT (" + WORD_COLUMN + ") DO UPDATE" +
            "SET " + DEFINITION_COLUMN + " = :" + DEFINITION_COLUMN +
            "RETURNING " + ALL_COLUMNS;

    @Override
    public Palindrome storePalindrome(Palindrome palindrome) {
        return jdbi.withHandle(handle -> handle.createQuery(UPSERT_WORD_SQL)
            .bind(WORD_COLUMN, palindrome.word)
            .bind(DEFINITION_COLUMN, palindrome.definition)
            .map(this::palindromeRowMapper)
            .first());
    }

    protected Palindrome palindromeRowMapper(ResultSet r, StatementContext ctx) throws SQLException {
        String word = r.getString(WORD_COLUMN);
        String definition = r.getString(DEFINITION_COLUMN);
        return new Palindrome(word,definition);
    }
}
