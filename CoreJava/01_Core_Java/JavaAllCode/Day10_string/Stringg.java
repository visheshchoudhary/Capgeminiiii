package Day10;

import java.util.Arrays;

public class Stringg {

	public static void main(String[] args) {
		String name = "Java Programmer";
		String name1 = "Java Programmer";
		System.out.println(name == name1);
System.out.println(name+name1);
System.out.println(name);
		
		String name2 = new String("Java Programmer");
		String name3 = new String("Java Programmer");
		System.out.println(name2 == name3);

		System.out.println("----toUpperCase---");
		System.out.println(name.toUpperCase());

		System.out.println("----toLowerCase---");
		System.out.println(name.toLowerCase());

		System.out.println("----indexOf()---");
		System.out.println(name.indexOf('a'));

		System.out.println("----indexOf()---");
		System.out.println(name.indexOf('a', 5));

		System.out.println("----charAt()---");
		System.out.println(name.charAt(5));

		System.out.println("----subString()---");
		System.out.println(name.substring(5));

		System.out.println("----subString()---");
		System.out.println(name.substring(5, 8));

		System.out.println("----startsWith()---");
		System.out.println(name.startsWith("Ja"));

		System.out.println("----endsWith()---");
		System.out.println(name.endsWith("er"));

		System.out.println("----contains()---");
		System.out.println(name.contains("Ja va "));

		System.out.println("----contains()---");
		System.out.println(name.contains("Ja va "));
		
		System.out.println("----contains()---");
		System.out.println(name.concat(" LPU"));
		
		System.out.println("----toCharArray()---");
		char[] ch=name.toCharArray();
		System.out.println(ch.length);
		Arrays.sort(ch);
		System.out.println(ch);
		
		System.out.println("----Length()---");
		System.out.println(name.length());
		
		
		StringBuffer sb=new StringBuffer("Anshul");
		StringBuffer sb1=new StringBuffer("Shreya");
		
		System.out.println(sb.append(sb1));
		System.out.println(sb);
		System.out.println(sb.reverse());
	}
}