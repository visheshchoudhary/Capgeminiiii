package Day10;

public class Child_Driver {
	public static void main(String[] args) {
		System.out.println("---Parent Object---");
		Parent p = new Parent();
		System.out.println(p.name);
		System.out.println(p.age);
		p.bike();

		System.out.println("---Child Object---");
		Child c = new Child();
		System.out.println(c.name);
		System.out.println(c.age);
		c.bike();

		System.out.println("---Upcasting---");
		Parent p1 = new Child();
		System.out.println(p1.name);
		System.out.println(p1.age);
		p1.bike();
		
		
		System.out.println("---Downcasting---");
		Child c1 = (Child)p1;
		System.out.println(c1.name);
		System.out.println(c1.age);
		//c1.bike();
	
	}
}