package Day8;
public class Parent{
	String name = "John";
	int age = 35;
	public void Demo() {
		System.out.println("Static Demo Method");
		Test();
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
}