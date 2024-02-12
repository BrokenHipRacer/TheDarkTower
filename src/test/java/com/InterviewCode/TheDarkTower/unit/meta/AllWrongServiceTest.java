package com.InterviewCode.TheDarkTower.unit.meta;

import com.InterviewCode.TheDarkTower.meta.allWrong.services.AllWrongService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

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

    @Test
    public void getWrongAnswerWithNSampleCase1() {
        int N = 3;
        String C = "ABA";
        assertEquals(allWrongService.getWrongAnswerIssueWithN(N,C), "BAB");
    }

    @Test
    public void getWrongAnswerWithNSampleCase2() {
        int N = 5;
        String C = "BBBBB";
        assertEquals(allWrongService.getWrongAnswerIssueWithN(N,C), "AAAAA");
    }

    @Test
    public void getWrongAnswerWithNSampleCase2Failure() {
        int N = 3;
        String C = "BBBBB";
        assertNotEquals(allWrongService.getWrongAnswerIssueWithN(N,C), "AAAAA");
    }

    @Test
    public void getWrongAnswersSmallSampleCase1() {
        String C = "ABA";
        assertEquals(allWrongService.getWrongAnswers(C), "BAB");
    }

    @Test
    public void getWrongAnswersSmallSampleCase2() {
        String C = "BBBBB";
        assertEquals(allWrongService.getWrongAnswers(C), "AAAAA");
    }

    @Test
    public void getWrongAnswersCaseInsensitiveSampleCase1_A() {
        int N = 3;
        String C = "ABA";
        assertEquals(allWrongService.getWrongAnswersCaseInsensitive(N,C), "BAB");
    }

    @Test
    public void getWrongAnswersCaseInsensitiveSampleCase1_B() {
        int N = 3;
        String C = "aBA";
        assertEquals(allWrongService.getWrongAnswersCaseInsensitive(N,C), "BAB");
    }

    @Test
    public void getWrongAnswersCaseInsensitiveSampleCase2_A() {
        int N = 5;
        String C = "BBBBB";
        assertEquals(allWrongService.getWrongAnswersCaseInsensitive(N,C), "AAAAA");
    }

    @Test
    public void getWrongAnswersCaseInsensitiveSampleCase2_B() {
        int N = 5;
        String C = "BbBbB";
        assertEquals(allWrongService.getWrongAnswersCaseInsensitive(N,C), "AAAAA");
    }
}
