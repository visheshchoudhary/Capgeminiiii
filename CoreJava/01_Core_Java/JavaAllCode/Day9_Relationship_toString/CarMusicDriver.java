package Day9_Relationship;

public class CarMusicDriver {

	public static void main(String[] args) {
		Car1 c=new Car1();
		System.out.println("----Calling Car member----");
		System.out.println(c.price);
		System.out.println(c.color);
		System.out.println(c.wheel);
		
		//c.StartMP();
		System.out.println("----Calling MusicPlayer member----");
		System.out.println(c.mp.bass);
		System.out.println(c.mp.volume);
		System.out.println(c.mp.mode);

	}

}
