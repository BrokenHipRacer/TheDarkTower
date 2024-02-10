package com.InterviewCode.TheDarkTower.unit.meta;

import com.InterviewCode.TheDarkTower.meta.abc_s.service.ABCService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class ABCServiceTest {

    @Autowired
    ABCService abcService;

    Random random = new Random();

    @Test
    public void getSumTest() {
        int A = random.nextInt();
        int B = random.nextInt();
        int C = random.nextInt();
        assertEquals(abcService.getSum(A, B, C), (A+B+C), "Expect sum of 3 random int values");
    }

    @Test
    public void sampleTestCase1() {
        int A = 1;
        int B = 2;
        int C = 3;
        assertEquals(abcService.getSum(A, B, C), 6, "Give sample set 1 against their signature");
    }

    @Test
    public void sampleTestCase2() {
        int A = 100;
        int B = 100;
        int C = 100;
        assertEquals(abcService.getSum(A, B, C), 300, "Give sample set 2 against their signature");
    }

    @Test
    public void sameTestCase3() {
        int A = 85;
        int B = 16;
        int C = 93;
        assertEquals(abcService.getSum(A, B, C), 194, "Give sample set 3 against their signature");
    }

    @Test
    public void getSumWastedSpace() {
        int A = random.nextInt();
        int B = random.nextInt();
        int C = random.nextInt();
        assertEquals(abcService.getSumWastedSpace(A, B, C), (A+B+C));
    }

    @Test
    public void sampleTestCase1WastedSpace() {
        int A = 1;
        int B = 2;
        int C = 3;
        assertEquals(abcService.getSumWastedSpace(A, B, C), 6);
    }

    @Test
    public void sampleTestCase2WastedSpace() {
        int A = 100;
        int B = 100;
        int C = 100;
        assertEquals(abcService.getSumWastedSpace(A, B, C), 300);
    }

    @Test
    public void sameTestCase3WastedSpace() {
        int A = 85;
        int B = 16;
        int C = 93;
        assertEquals(abcService.getSumWastedSpace(A, B, C), 194);
    }

    @Test
    public void getSumMoreExpanded() {
        int A = random.nextInt();
        int B = random.nextInt();
        int C = random.nextInt();
        assertEquals(abcService.getSumMoreExpanded(A, B, C), (A+B+C));
    }

    @Test
    public void getSumMoreExpandedRandSet() {
        int howMany = random.nextInt(999);
        int[] intArray = new int[howMany];
        for ( int i = 0; i < howMany; i++ ) {
            intArray[i] = random.nextInt();
        }
        assertEquals(abcService.getSumMoreExpanded(intArray), Arrays.stream(intArray).sum());
    }

    @Test
    public void sampleTestCase1SumMoreExpanded() {
        int A = 1;
        int B = 2;
        int C = 3;
        assertEquals(abcService.getSumMoreExpanded(A, B, C), 6);
    }

    @Test
    public void sampleTestCase2SumMoreExpanded() {
        int A = 100;
        int B = 100;
        int C = 100;
        assertEquals(abcService.getSumMoreExpanded(A, B, C), 300);
    }

    @Test
    public void sameTestCase3SumMoreExpanded() {
        int A = 85;
        int B = 16;
        int C = 93;
        assertEquals(abcService.getSumMoreExpanded(A, B, C), 194);
    }

    @Test
    public void getSumMoreSmall() {
        int A = random.nextInt();
        int B = random.nextInt();
        int C = random.nextInt();
        assertEquals(abcService.getSumMoreSmall(A, B, C), (A+B+C));
    }

    @Test
    public void getSumMoreSmallRandSet() {
        int howMany = random.nextInt(999);
        int[] intArray = new int[howMany];
        for ( int i = 0; i < howMany; i++ ) {
            intArray[i] = random.nextInt();
        }
        assertEquals(abcService.getSumMoreSmall(intArray), Arrays.stream(intArray).sum());
    }

    @Test
    public void sampleTestCase1getSumMoreSmall() {
        int A = 1;
        int B = 2;
        int C = 3;
        assertEquals(abcService.getSumMoreSmall(A, B, C), 6);
    }

    @Test
    public void sampleTestCase2getSumMoreSmall() {
        int A = 100;
        int B = 100;
        int C = 100;
        assertEquals(abcService.getSumMoreSmall(A, B, C), 300);
    }

    @Test
    public void sameTestCase3getSumMoreSmall() {
        int A = 85;
        int B = 16;
        int C = 93;
        assertEquals(abcService.getSumMoreSmall(A, B, C), 194);
    }
}
