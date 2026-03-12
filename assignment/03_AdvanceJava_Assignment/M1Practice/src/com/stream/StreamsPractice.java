package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamsPractice {
	
	public static void main(String[] args) {
//		List<Integer> list = Arrays.asList(1, 2, 4, 5, 7, 8);
//		
//		list = list.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
//		
//		System.out.println(list);
		
		// give a list of names - print only those that start with 'R', convert them to uppercase, sort them alphabetically, and display the result
//		List<String> list = Arrays.asList("Ansh", "Rohit", "Rana", "Shyam");
//		list = list.stream().filter(n -> n.startsWith("R")).map(n -> n.toUpperCase()).sorted().collect(Collectors.toList());
//		System.out.println(list);
		
		
		// given a list of integer - multiply all even numbers by 10 and print the final list.
//		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
//		list = list.stream().filter(n -> n % 2 == 0).map(n -> n * 10).collect(Collectors.toList());
//		System.out.println(list);
		
		
//		// Convert a list of names to uppercase and sort them alphabetically 
//		List<String> list = Arrays.asList("Ansh", "Rohit", "Rana", "Shyam");
//		list = list.stream().map(n -> n.toUpperCase()).sorted().collect(Collectors.toList());
//		System.out.println(list);
		
		
		// Count how many numbers in a list are greater than 7
//		List<Integer> list = Arrays.asList(4, 6, 8, 9, 10, 11);
//		long count = list.stream().filter(n -> n > 7).count();
//		System.out.println(count);
		
		
		// Given a list of names, use stream api to concatenate all names into a single string using reduce()
//		List<String> list = Arrays.asList("Ansh", "Rohit", "Rana", "Shyam");
//		String ans = list.stream().reduce("", (a, b) -> a + b + " ");
//		System.out.println(ans);
		
		
		// find and print the first element that starts with the letter 's' in a list.
//		List<String> list = Arrays.asList("Ansh", "Rohit", "Rana", "Shyam");
//		list.stream().filter(name -> name.toLowerCase().startsWith("s")).findFirst().ifPresent(System.out::println);
		
		
		// remove duplicate elements from a list, sort the remaining elements, and print them
//		List<Integer> list = Arrays.asList(6, 6, 1, 2, 9, 9, 2, 5);
//		list = list.stream().distinct().sorted().collect(Collectors.toList());
//		System.out.println(list);
		
		
		// find the first longest string in a list using stream api
//		List<String> list = Arrays.asList("Ansh", "Rohit", "Rana", "Shyam");
//		String res = list.stream().reduce("", (a, b) -> a.length() > b.length() ? a : b);
//		System.out.println(res);
	}
}
