package com.InterviewCode.TheDarkTower.palindrome.repositories;

import com.InterviewCode.TheDarkTower.palindrome.objects.Palindrome;
import io.vavr.collection.List;

public interface PalindromeRepository {

    List<Palindrome> getAll();

    Palindrome storePalindrome(Palindrome palindrome);
}
