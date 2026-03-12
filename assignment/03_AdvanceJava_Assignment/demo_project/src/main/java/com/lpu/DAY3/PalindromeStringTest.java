package com.lpu.DAY3;

public class PalindromeStringTest {

	public static boolean isPalindrome(String a)
	{
		int low = 0, high = a.length() - 1;
		boolean isPalindrome = true;
		
		while(low <= high)
		{
			if(a.charAt(low) == a.charAt(high))
			{
				low++;
				high--;
			}
			else
			{
				isPalindrome = false;
				break;
			}
		}
		return isPalindrome;
	}
}
