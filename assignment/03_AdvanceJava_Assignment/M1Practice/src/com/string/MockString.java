package com.string;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MockString {

	
	public static String processString(String str, int K)
	{
		String rev = new StringBuilder(str).reverse().toString();
		
		StringBuilder vowel = new StringBuilder();
		
		for(char c : rev.toCharArray())
		{
			vowel.append(charVowel(c));
		}
		
		Set<Character> set = new HashSet<>();
		
		for(char c : vowel.toString().toCharArray())
		{
			set.add(c);
		}
		
		StringBuilder noDup = new StringBuilder();
		for(char c : set)
		{
			noDup.append(c);
		}
		
		int n = noDup.length();
		K = K % n;
		
		return noDup.substring(n - K) + noDup.substring(0, n - K);
	}
	
	public static char charVowel(char c)
	{
		if(c == 'a')
			return 'e';
		if(c == 'e')
			return 'i';
		if(c == 'i')
			return 'o';
		if(c == 'o')
			return 'u';
		if(c == 'u')
			return 'a';
		
		return c;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		while(T-- > 0)
		{
			String str = sc.next();
			int K = sc.nextInt();
			
			System.out.println(processString(str, K));
		}
	}
}
