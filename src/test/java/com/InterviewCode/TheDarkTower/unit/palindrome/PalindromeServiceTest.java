package com.InterviewCode.TheDarkTower.unit.palindrome;

import com.InterviewCode.TheDarkTower.palindrome.services.PalindromeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class PalindromeServiceTest {

    @Autowired
    PalindromeService palindromeService;

    @Test
    public void exampleTest() {
        String expected = "poop";
        assertEquals(palindromeService.exampleString(), expected);
    }

    @Test
    public void isPalindromeByBufferTestSuccess() {
        String expectedPassing = "1221";
        assertEquals(palindromeService.isPalindromeByBuffer(expectedPassing).getIsPalindrome(), true);
    }

    @Test
    public void isPalindromeByBufferTestFail() {
        String expectedFailing = "1234";
        assertEquals(palindromeService.isPalindromeByBuffer(expectedFailing).getIsPalindrome(), false);
    }

    @Test
    public void isPalindromeWithoutBufferTestSuccess() {
        String expectedSuccess = "pippip";
        assertEquals(palindromeService.isPalindromeWithoutBuffer(expectedSuccess).isPalindrome, true);
    }

    @Test
    public void isPalindromeWithoutBufferTestFail() {
        String expectedFailing = "alpha";
        assertEquals(palindromeService.isPalindromeWithoutBuffer(expectedFailing).isPalindrome, false);
    }
}
