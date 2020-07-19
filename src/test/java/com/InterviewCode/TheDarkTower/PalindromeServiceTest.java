package com.InterviewCode.TheDarkTower;

import com.InterviewCode.TheDarkTower.palindrome.services.PalindromeService;
import io.vavr.collection.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@SpringBootTest
@RunWith(SpringRunner.class)
public class PalindromeServiceTest {

    @Autowired
    PalindromeService palindromeService;

    @Test
    public void getAllTest() {
        List<String> expected = List.of("1221", "poop", "pop");
        assertEquals(palindromeService.getAll(), expected);
    }

    @Test
    public void exampleTest() {
        String expected = "poop";
        assertEquals(palindromeService.exampleString(), expected);
    }

    @Test
    public void isPalindromeByBufferTestSuccess() {
        String expectedPassing = "1221";
        assertEquals(palindromeService.isPalindromeByBuffer(expectedPassing), true);
    }

    @Test
    public void isPalindromeByBufferTestFail() {
        String expectedFailing = "1234";
        assertEquals(palindromeService.isPalindromeByBuffer(expectedFailing), false);
    }

    @Test
    public void isPalindromeWithoutBufferTestSuccess() {
        String expectedSuccess = "pippip";
        assertEquals(palindromeService.isPalindromeWithoutBuffer(expectedSuccess), true);
    }

    @Test
    public void isPalindromeWithoutBufferTestFail() {
        String expectedFailing = "alpha";
        assertEquals(palindromeService.isPalindromeWithoutBuffer(expectedFailing), false);
    }
}
