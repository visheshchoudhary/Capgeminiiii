package com.lpu.DAY3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PalindromeTest {

	@Test
	public void testPalindrome()
	{
//		boolean isPal = PalindromeStringTest.isPalindrome();
//		Assertions.assertEquals(false, isPal);
		Assertions.assertTrue(PalindromeStringTest.isPalindrome("abcba"));
	}
}
