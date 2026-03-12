package Day12_Abstraction;
public abstract class Parent {
	
	public static void main(String[] args) {

	}
	static String name = "John";
	int age = 35;
	public static void Demo() {
		System.out.println("Static Demo Method");
		
	}

	public void Test() {
		Demo();
		System.out.println("Non Static Test Method");
	}

	{
		System.out.println("Non Static Initializer");
	}
	static{
		System.out.println("Static Initializer");
	}

	Parent() {
		System.out.println("Constructor");
	}
	public abstract void abs();
	
	//Parent p=new Parent();
}