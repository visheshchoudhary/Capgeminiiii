package Day11;

public class ExceptionChecked {

	static void thread()throws InterruptedException
	{
		for (int i = 1; i <= 15; i++) {
			Thread.sleep(500);
			System.out.println(i);
		}
	}

	public static void main(String[] args) throws InterruptedException
	{
		thread();
	}
}