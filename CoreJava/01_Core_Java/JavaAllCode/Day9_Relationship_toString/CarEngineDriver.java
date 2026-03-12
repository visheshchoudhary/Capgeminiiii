package Day9_Relationship;

public class CarEngineDriver {

	public static void main(String[] args) {
		Car c=new Car(10);
		System.out.println("----Calling Engine member----");

		System.out.println(c.price);
		System.out.println(c.color);
		System.out.println(c.wheel);
		System.out.println("----Calling Engine member----");
		System.out.println(c.e.cc);
		System.out.println(c.e.type);

	}

}
