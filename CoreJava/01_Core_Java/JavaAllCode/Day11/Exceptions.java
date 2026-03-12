package Day11;
import java.util.Scanner;
public class Exceptions {
	
	public static void main(String[] args) {
		System.out.println("----Software Starts----");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number");
		int a=sc.nextInt();
		System.out.println("Enter Second Number");
		
		int b=sc.nextInt();
		try
		{
		int c=a/b;
		System.out.println(c);
		String name="Keshav";
		name=null;
		//name.length();
//		int[] ar=new int[2];
//		ar[2]=10;
		}
		
		
//		catch(ArithmeticException tr)
//		{
//			System.out.println("ArithmeticException Handled");	
//		}
//		catch(StringIndexOutOfBoundsException tr)
//		{
//			System.out.println("StringIndexOutOfBoundsException Handled");
//			
//		}
//		catch(NullPointerException tr)
//		{
//			System.out.println("NullPointerException Handled");	
//		}
//		catch(ArrayIndexOutOfBoundsException tr)
//		{
//			System.out.println("ArrayIndexOutOfBoundsException Handled");	
//		}
//		catch(RuntimeException tr)
//		{
//			System.out.println("RuntimeException Handled");	
//		}
//		catch(Exception tr)
//		{
//			System.out.println("Exception Handled");	
//		}
		//System.out.println("Hello Finally");
		finally
		{
		System.out.println("Finally Executed");	
		System.out.println("All Program Closed");	
		}
		System.out.println("----Software Closed----");	
	}
}