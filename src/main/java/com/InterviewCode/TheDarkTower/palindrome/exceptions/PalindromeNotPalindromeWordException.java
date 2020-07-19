package com.InterviewCode.TheDarkTower.palindrome.exceptions;

public class PalindromeNotPalindromeWordException extends RuntimeException {

	public PalindromeNotPalindromeWordException(String word) {
		super("The word " + word + " is not a palindrome");
	}
}
