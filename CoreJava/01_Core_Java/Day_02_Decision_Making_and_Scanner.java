// // // ===============================
// // // 1. Global vs Local Variable
// // // ===============================
// // public class Twenty1 {
// //     static int age = 100; // global (static)

// //     public static void main(String[] args) {
// //         int age = 10; // local
// //         System.out.println(Twenty1.age); // 100
// //     }
// // }


// // // ===============================
// // // 2. Type Casting (Widening & Narrowing)
// // // ===============================
// // class Twenty2 {
// //     public static void main(String[] args) {

// //         // Widening (automatic)
// //         byte a = 100;
// //         int b = a;
// //         System.out.println(b);

// //         // Narrowing (explicit)
// //         int x = 130;
// //         byte y = (byte) x;
// //         System.out.println(y);
// //     }
// // }


// // // ===============================
// // // 3. Scanner Input (Basic)
// // // ===============================
// // import java.util.Scanner;

// // class Twenty3 {
// //     public static void main(String[] args) {
// //         Scanner sc = new Scanner(System.in);

// //         System.out.print("Enter age: ");
// //         int age = sc.nextInt();

// //         System.out.print("Enter name: ");
// //         String name = sc.next();

// //         System.out.println("Age: " + age);
// //         System.out.println("Name: " + name);
// //     }
// // }


// // // ===============================
// // // 4. Nested If (Age & Weight)
// // // ===============================
// // import java.util.Scanner;

// // class Twenty4 {
// //     public static void main(String[] args) {
// //         Scanner sc = new Scanner(System.in);

// //         System.out.print("Enter age: ");
// //         int age = sc.nextInt();

// //         System.out.print("Enter weight: ");
// //         int weight = sc.nextInt();

// //         if (age < 17) {
// //             if (weight < 45) {
// //                 System.out.println("Under weight");
// //             } else {
// //                 System.out.println("Over weight");
// //             }
// //         } else {
// //             System.out.println("Age is sufficient");
// //         }
// //     }
// // }


// // // ===============================
// // // 5. Eligibility Check (String Comparison)
// // // ===============================
// // import java.util.Scanner;

// // class Twenty5 {
// //     public static void main(String[] args) {
// //         Scanner sc = new Scanner(System.in);

// //         System.out.print("Enter degree: ");
// //         String degree = sc.nextLine();

// //         System.out.print("Enter stream: ");
// //         String stream = sc.nextLine();

// //         System.out.print("Know Java (yes/no): ");
// //         String javaSkill = sc.nextLine();

// //         if (degree.equalsIgnoreCase("btech")) {
// //             if (stream.equalsIgnoreCase("it")) {
// //                 if (javaSkill.equalsIgnoreCase("yes")) {
// //                     System.out.println("Eligible");
// //                 } else {
// //                     System.out.println("Java not known");
// //                 }
// //             } else {
// //                 System.out.println("Not IT stream");
// //             }
// //         } else {
// //             System.out.println("Not eligible");
// //         }
// //     }
// // }


// // // ===============================
// // // 6. Switch Calculator
// // // ===============================
// // import java.util.Scanner;

// // class Twenty6 {
// //     public static void main(String[] args) {
// //         Scanner sc = new Scanner(System.in);

// //         System.out.print("Enter first number: ");
// //         int a = sc.nextInt();

// //         System.out.print("Enter second number: ");
// //         int b = sc.nextInt();

// //         System.out.println("1:Add  2:Sub  3:Mul  4:Div");
// //         int choice = sc.nextInt();

// //         switch (choice) {
// //             case 1: System.out.println(a + b); break;
// //             case 2: System.out.println(a - b); break;
// //             case 3: System.out.println(a * b); break;
// //             case 4: System.out.println(a / b); break;
// //             default: System.out.println("Invalid");
// //         }
// //     }
// // }


// // // ===============================
// // // 7. Even or Odd (Ternary)
// // // ===============================
// // import java.util.Scanner;

// // class Twenty7 {
// //     public static void main(String[] args) {
// //         Scanner sc = new Scanner(System.in);

// //         int a = sc.nextInt();
// //         String res = (a % 2 == 0) ? "Even" : "Odd";
// //         System.out.println(res);
// //     }
// // }


// // // ===============================
// // // 8. Divisible by 5 and 11
// // // ===============================
// // import java.util.Scanner;

// // class Twenty8 {
// //     public static void main(String[] args) {
// //         Scanner sc = new Scanner(System.in);

// //         int a = sc.nextInt();
// //         String res = (a % 5 == 0 && a % 11 == 0) ? "Yes" : "No";
// //         System.out.println(res);
// //     }
// // }


// // // ===============================
// // // 9. Triangle Validity
// // // ===============================
// // import java.util.Scanner;

// // class Twenty9 {
// //     public static void main(String[] args) {
// //         Scanner sc = new Scanner(System.in);

// //         int a = sc.nextInt();
// //         int b = sc.nextInt();
// //         int c = sc.nextInt();

// //         if ((a + b > c) && (a + c > b) && (b + c > a)) {
// //             System.out.println("Triangle");
// //         } else {
// //             System.out.println("Not Triangle");
// //         }
// //     }
// // }


// // // ===============================
// // // 10. Uppercase or Lowercase
// // // ===============================
// // import java.util.Scanner;

// // class Twenty10 {
// //     public static void main(String[] args) {
// //         Scanner sc = new Scanner(System.in);

// //         char ch = sc.next().charAt(0);

// //         if (ch >= 'A' && ch <= 'Z') {
// //             System.out.println("Uppercase");
// //         } else if (ch >= 'a' && ch <= 'z') {
// //             System.out.println("Lowercase");
// //         } else {
// //             System.out.println("Not an alphabet");
// //         }
// //     }
// // }



// //// -------------------NOTES---------------------------------
// /// 
// /// 
// /// 
// /// 
// 📘 Core Java – Decision Making Statements & Scanner Class

// This document contains notes and practice concepts learned in class related to decision making statements and the Scanner class in Java.

// 1️⃣ Decision Making Statements in Java

// Decision making statements are used to control the flow of execution based on conditions.
// They allow the program to make decisions and execute different blocks of code accordingly.

// 2️⃣ Types of Decision Making Statements
// 🔹 1. Simple if Statement

// Executes a block of code only if the condition is true.

// If the condition is false, the block is skipped.

// Use case:
// When you want to check a single condition.

// 🔹 2. if – else Statement

// Executes one block if the condition is true.

// Executes another block if the condition is false.

// Use case:
// When two opposite conditions exist.

// 🔹 3. if – else if – else Statement

// Used to check multiple conditions.

// Conditions are checked top to bottom.

// Only the first true condition is executed.

// Use case:
// When more than two choices are available.

// 🔹 4. Nested if Statement

// An if statement inside another if.

// Used when a condition depends on another condition.

// Use case:
// When multiple dependent conditions are required.

// 🔹 5. switch Statement

// Used to execute one case from many options.

// Works with:

// int, char, String, enum

// Each case must end with break to avoid fall-through.

// Use case:
// When there are fixed known values.

// 3️⃣ Scanner Class in Java

// The Scanner class is used to take input from the user at runtime.

// 🔹 Why Scanner is Used?

// To read input from:

// Keyboard

// File

// Other input sources

// 🔹 Package

// Scanner class belongs to:

// java.util

// 🔹 Common Methods of Scanner
// Method	Description
// nextInt()	Reads integer
// nextFloat()	Reads float
// nextDouble()	Reads double
// next()	Reads single word
// nextLine()	Reads full line
// nextBoolean()	Reads true/false
// 4️⃣ Important Points (Exam / Interview)

// if conditions must return boolean value

// switch does not work with boolean

// break prevents execution of next cases

// Scanner object should be closed after use

// if-else is slower than switch for many conditions

// 5️⃣ Summary

// Decision making statements control program flow

// if, if-else, else-if, nested if, and switch are core concepts

// Scanner class helps in dynamic input handling

// These concepts are very important for logic building