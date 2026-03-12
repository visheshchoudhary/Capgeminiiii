// Arithmetic Exception

// import java.util.Scanner;
// public class exceptio {
//     public static void main(String[] args){
//         Scanner s=new Scanner(System.in);
//         System.out.println("Enter first number");
//         int a=s.nextInt();
//         System.out.println("Enter second number");
//         int b=s.nextInt();
//         try{
//             int c=a/b;
//             System.out.println("Result:--"+c);
//         }catch(){
//             System.out.println("Exception handled");
//             //System.out.println(e.getMessage());
//         }
//     }
// }




// IndexOutOfBoundsException

// import java.util.Scanner;
// public class exceptio {
//     public static void main(String[] args){
//         Scanner s=new Scanner(System.in);
//         System.out.println("Enter first string");
//         String a="luc";
//         try{
//             System.out.println(a.charAt(3));
//         }catch(IndexOutOfBoundsException e){
//             System.out.println("Exception handled");
//             System.out.println(e.getMessage());
//         }
//     }   
// }










// for checking the type of number or any thing
// import java.util.Scanner;
// public class exceptio {
//     public static void main(String[] args){
//         Scanner s=new Scanner(System.in);
//         int a = 5;
//         Integer obj = a; 
//         System.out.println(obj.getClass().getSimpleName());
//     }   
// }



//////////////////////////////////////////
/// 




// import java.util.Scanner;
// public class exceptio {
//     public static void main(String[] args){
//         Scanner s=new Scanner(System.in);
//         int a = 5;
//         int b=0;
//         int[] arr={4,5,6,7};
//         try {
//             System.out.println(a/b);
//         } catch (ArithmeticException e) {
//             System.out.println("dn");
//         }
//         try {
//             System.out.println(arr[6]);
//         } catch (ArrayIndexOutOfBoundsException e) {
//             System.out.println("dn 2");
//         }
//         try {
//             System.out.println(arr[6]);
//         } catch (ArrayIndexOutOfBoundsException e) {
//             System.out.println("dn 3");
//         }finally{
//             System.out.println("Closed");
//         }
//     }   
// }





//////////////////////==================================================
/// 




// import java.io.FileReader;
// import java.io.FileNotFoundException;

// // Custom Exception
// class InvalidAgeException extends Exception {
//     InvalidAgeException(String msg) {
//         super(msg);
//     }
// }


// public class ExceptionDemo {

//     // Checked Exception using throws
//     static void readFile() throws FileNotFoundException {
//         FileReader fr = new FileReader("abc.txt"); // Checked Exception
//     }

//     // Custom Exception using throw
//     static void checkAge(int age) throws InvalidAgeException {
//         if (age < 18) {
//             throw new InvalidAgeException("Age must be 18 or above");
//         }
//         System.out.println("Eligible to vote");
//     }

//     public static void main(String[] args) {

//         try {
//             // 1️⃣ Unchecked Exception
//             int a = 10 / 0;   // ArithmeticException

//             // 2️⃣ Checked Exception
//             readFile();

//             // 3️⃣ Custom Exception
//             checkAge(15);

//         }
//         catch (ArithmeticException e) {
//             System.out.println("Arithmetic Exception handled");
//         }
//         catch (FileNotFoundException e) {
//             System.out.println("File not found exception handled");
//         }
//         catch (InvalidAgeException e) {
//             System.out.println(e.getMessage());
//         }
//         finally {
//             // Always executes
//             System.out.println("Finally block executed (Cleanup code)");
//         }

//         System.out.println("Program continues normally");
//     }
// }



//===========================================================================

// import java.util.*;

// class exceptio{

//     public static void main(String[] args) {

//         Scanner sc= new Scanner(System.in);
//         String a=sc.nextLine();
//         int n=a.length();
//         String b=sc.nextLine();
//         //int i=0;
//         for(int i=0;i<n;i++){
//             for(int j=0;j<n;j++){
//                 if(a.charAt(i)!=b.charAt(j)){
//                     System.out.println("No Anagram");
//                 }
//             }
//         }


        
//     }
// }
