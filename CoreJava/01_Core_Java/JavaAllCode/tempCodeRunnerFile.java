


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your first number:--");
        int a = sc.nextInt();
        System.out.print("Enter your second number:--");
        int b = sc.nextInt();
        System.out.println("Enter the operation u want to perform:--");
        
        System.out.println("Enter the 1 for addition");
        
        System.out.println("Enter the 2 for subraction");
        
        System.out.println("Enter the 3 for multi");
        
        System.out.println("Enter the 4 for division");
        
        int c = sc.nextInt();
        switch (c) {
            case 1:
                 System.out.println("Result = " + (a+b));
                break;
            case 2:
                 System.out.println("Result = " + (a-b));
                break;
            case 3:
                 System.out.println("Result = " + (a*b));
                break;
            case 4:
                 System.out.println("Result = " + (a/b));
                break;
            default:
                System.out.println("Error");
        }

    }
}


