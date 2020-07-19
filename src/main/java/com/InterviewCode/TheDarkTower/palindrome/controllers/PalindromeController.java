package com.InterviewCode.TheDarkTower.palindrome.controllers;

import com.InterviewCode.TheDarkTower.palindrome.objects.Palindrome;
import com.InterviewCode.TheDarkTower.palindrome.objects.PalindromeResult;
import com.InterviewCode.TheDarkTower.palindrome.services.PalindromeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

import static com.InterviewCode.TheDarkTower.palindrome.PostgresConstants.DEFINITION_COLUMN;
import static com.InterviewCode.TheDarkTower.palindrome.PostgresConstants.WORD_COLUMN;

@RestController
@RequestMapping("/palindromes")
public class PalindromeController {

	private final PalindromeService palindromeService;
	
	PalindromeController(PalindromeService palindromeService) {
		this.palindromeService = palindromeService;
	}
	
	@GetMapping("/")
	ResponseEntity<Object> all() {
		return ResponseEntity.ok(palindromeService.getAll());
	}
	
	@GetMapping("/example")
	ResponseEntity<String> madeUpPalindrome() {
		return ResponseEntity.ok(palindromeService.exampleString());
	}

	@GetMapping("/exampleAsObject")
	ResponseEntity<Object> madeUpPalindromResult() {
		return ResponseEntity.ok(palindromeService.resultSample());
	}
	
	@PutMapping("/isPalindromeByBuffer/{word}")
	ResponseEntity<Object> isPalindromeByBuffer(@PathVariable String word) {
		PalindromeResult palindromeResult = palindromeService.isPalindromeByBuffer(word.toLowerCase());
		if (palindromeResult.isPalindrome) {
			return ResponseEntity.ok(palindromeResult);
		}
		return ResponseEntity.badRequest().body(palindromeResult);
	}

	@PutMapping("/isPalindromeWithoutBuffer/{word}")
	ResponseEntity<Object> isPalindromeWithoutBuffer(@PathVariable String word) {
		PalindromeResult palindromeResult = palindromeService.isPalindromeWithoutBuffer(word.toLowerCase());
		if (palindromeResult.isPalindrome) {
			return ResponseEntity.ok(palindromeResult);
		}
		return ResponseEntity.badRequest().body(palindromeResult);
	}

	@PostMapping("/storeWord")
	ResponseEntity<Object> storeWord(@MatrixVariable Map<String, String> word) {
		PalindromeResult palindromeResult = palindromeService.isPalindromeWithoutBuffer(word.get(WORD_COLUMN).toLowerCase());
		if (palindromeResult.isPalindrome) {
			Palindrome newWord = new Palindrome(word.get(WORD_COLUMN).toLowerCase(), word.get(DEFINITION_COLUMN));
			return ResponseEntity.ok(palindromeService.store(newWord));
		}
		return ResponseEntity.badRequest().body(palindromeResult);

	}
}