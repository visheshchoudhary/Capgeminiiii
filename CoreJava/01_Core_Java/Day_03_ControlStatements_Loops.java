/*
=====================================================
JAVA BASICS – CLASSROOM PRACTICE PROGRAMS
Author: Lucky Singh
=====================================================

IMPORTANT DEFINITIONS:

1. if–else:
   Used to make decisions based on conditions.

2. switch:
   Used when we have fixed options (day, menu, choice).

3. for loop:
   Used when number of iterations is known.

4. while loop:
   Used when iterations are unknown.

5. do–while loop:
   Runs at least once even if condition is false.

6. Scanner:
   Used to take input from the user.

7. equals():
   Used to compare String values (NOT ==).

=====================================================
*/

import java.util.*;
class twentytwo {

    // ================================
    // 1️⃣ Check driving eligibility
    // ================================
    /*
    Question:
    Take age as input and decide which vehicle a person can drive.
    */

    /*
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if (age >= 20) {
            System.out.println("He can drive car");
        } else if (age >= 18) {
            System.out.println("He can drive bike");
        } else if (age >= 16) {
            System.out.println("He can drive scooty");
        } else {
            System.out.println("Not eligible");
        }
    }
    */

    // ================================
    // 2️⃣ Grade system
    // ================================
    /*
    Question:
    Take marks as input and print grade.
    */

    /*
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();

        if (marks >= 90) System.out.println("A+");
        else if (marks >= 80) System.out.println("A");
        else if (marks >= 70) System.out.println("B+");
        else if (marks >= 60) System.out.println("B");
        else if (marks >= 50) System.out.println("C+");
        else if (marks >= 40) System.out.println("C");
        else System.out.println("Fail");
    }
    */

    // ================================
    // 3️⃣ Day and food (switch case)
    // ================================
    /*
    Question:
    Enter day name and suggest food.
    */

    /*
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String day = sc.nextLine().toLowerCase();

        switch (day) {
            case "monday": System.out.println("Eat biryani"); break;
            case "tuesday": System.out.println("Eat samosa"); break;
            case "wednesday": System.out.println("Eat rasgulla"); break;
            case "thursday": System.out.println("Eat aloo"); break;
            case "friday": System.out.println("Eat mithai"); break;
            case "saturday": System.out.println("Eat mango"); break;
            case "sunday": System.out.println("Eat jeera rice"); break;
            default: System.out.println("Invalid day");
        }
    }
    */

    // ================================
    // 4️⃣ Square or rectangle
    // ================================
    /*
    Question:
    Take length and breadth and check if square.
    */

    /*
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int b = sc.nextInt();

        if (l == b) System.out.println("Square");
        else System.out.println("Rectangle");
    }
    */

    // ================================
    // 5️⃣ Greatest of two numbers
    // ================================
    /*
    Question:
    Find greatest number between two numbers.
    */

    /*
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Greatest: " + (a > b ? a : b));
    }
    */

    // ================================
    // 6️⃣ T-shirt discount
    // ================================
    /*
    Question:
    Each T-shirt costs 200.
    If total > 1000 give 10% discount.
    */

    /*
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int qty = sc.nextInt();
        int total = qty * 200;

        if (total > 1000) {
            System.out.println("Pay: " + total * 0.9);
        } else {
            System.out.println("Pay: " + total);
        }
    }
    */

    // ================================
    // 7️⃣ Bonus based on experience
    // ================================
    /*
    Question:
    If experience > 5 years give 5% bonus.
    */

    /*
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salary = sc.nextDouble();
        int exp = sc.nextInt();

        if (exp > 5) {
            System.out.println("Salary with bonus: " + salary * 1.05);
        } else {
            System.out.println("Salary: " + salary);
        }
    }
    */

    // ================================
    // 8️⃣ Oldest and youngest
    // ================================
    /*
    Question:
    Find oldest and youngest among three people.
    */

    /*
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a >= b && a >= c) System.out.println("Oldest: A");
        else if (b >= a && b >= c) System.out.println("Oldest: B");
        else System.out.println("Oldest: C");

        if (a <= b && a <= c) System.out.println("Youngest: A");
        else if (b <= a && b <= c) System.out.println("Youngest: B");
        else System.out.println("Youngest: C");
    }
    */

    // ================================
    // 9️⃣ Attendance percentage
    // ================================
    /*
    Question:
    Calculate attendance percentage and check eligibility.
    */

    /*
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int held = sc.nextInt();
        int attended = sc.nextInt();

        float per = (attended * 100f) / held;
        System.out.println("Attendance: " + per + "%");

        if (per >= 75) System.out.println("Allowed");
        else System.out.println("Not allowed");
    }
    */

    // ================================
    // 🔟 Uppercase or lowercase
    // ================================
    /*
    Question:
    Check whether a character is uppercase or lowercase.
    */

    /*
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);

        if (ch >= 'A' && ch <= 'Z') System.out.println("Uppercase");
        else if (ch >= 'a' && ch <= 'z') System.out.println("Lowercase");
        else System.out.println("Invalid");
    }
    */

    // ================================
    // 1️⃣1️⃣ Factorial using do-while
    // ================================
    /*
    Question:
    Find factorial and repeat using do-while.
    */

    /*
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ch;

        do {
            int n = sc.nextInt();
            int fact = 1;
            for (int i = 1; i <= n; i++) fact *= i;
            System.out.println("Factorial: " + fact);

            sc.nextLine();
            ch = sc.nextLine();
        } while (ch.equalsIgnoreCase("Y"));
    }
    */

    // ================================
    // 1️⃣2️⃣ Prime number
    // ================================
    /*
    Question:
    Check whether a number is prime.
    */

    /*
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean prime = true;

        if (n <= 1) prime = false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                prime = false;
                break;
            }
        }

        System.out.println(prime ? "Prime" : "Not Prime");
    }
    */
}
