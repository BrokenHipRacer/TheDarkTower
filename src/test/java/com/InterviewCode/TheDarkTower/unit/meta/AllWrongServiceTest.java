package com.InterviewCode.TheDarkTower.unit.meta;

import com.InterviewCode.TheDarkTower.meta.allWrong.services.AllWrongService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class AllWrongServiceTest {

    @Autowired
    AllWrongService allWrongService;

    @Test
    public void getWrongAnswersSampleCase1() {
        int N = 3;
        String C = "ABA";
        assertEquals(allWrongService.getWrongAnswers(N,C), "BAB");
    }

    @Test
    public void getWrongAnswersSampleCase2() {
        int N = 5;
        String C = "BBBBB";
        assertEquals(allWrongService.getWrongAnswers(N,C), "AAAAA");
    }
}
