package Day11;

public class NullPointerExceptions {

	public static void main(String[] args) {
	
		String name="Naman";
	//name=null;
	System.out.println(name.charAt(5));
	try {
	System.out.println(name.length());
	}
	catch(NullPointerException n)
	{
	System.out.println("Null Pointer Exception Handled");	
	}
	}
}