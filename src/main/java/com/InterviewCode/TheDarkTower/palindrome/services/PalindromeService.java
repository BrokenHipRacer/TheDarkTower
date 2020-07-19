package com.InterviewCode.TheDarkTower.palindrome.services;

import com.InterviewCode.TheDarkTower.palindrome.objects.Palindrome;
import com.InterviewCode.TheDarkTower.palindrome.objects.PalindromeResult;
import com.InterviewCode.TheDarkTower.palindrome.repositories.PalindromeRepository;
import io.vavr.collection.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PalindromeService {

    private PalindromeRepository palindromeRepository;

    PalindromeService(PalindromeRepository palindromeRepository) {
        this.palindromeRepository = palindromeRepository;
    }

    @Transactional
    public List<Palindrome> getAll() {
        return palindromeRepository.getAll();
    }

    public String exampleString() {
        return "poop";
    }

    public PalindromeResult isPalindromeByBuffer(String word) {
        StringBuffer simplify = new StringBuffer(word);
        Boolean wordBool = word.equals(simplify.reverse().toString());
        return new PalindromeResult(word, wordBool);
    }

    public PalindromeResult isPalindromeWithoutBuffer(String word) {
        Boolean wordBool = word.equals(reverseAString(word.toCharArray()));
        return new PalindromeResult(word, wordBool);
    }

    @Transactional
    public Palindrome store(Palindrome word) {
        return palindromeRepository.storePalindrome(word);
    }

    @Transactional
    public Palindrome resultSample() {
        return palindromeRepository.getAll().shuffle().peek();
    }

    public String reverseAString(char[] given) {
        String reverse = "";
        for (char letter : given) {
            reverse = Character.toString(letter).concat(reverse);
        }
        return reverse;
    }

}
