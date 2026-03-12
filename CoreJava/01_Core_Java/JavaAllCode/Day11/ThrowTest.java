package Day11;


class NoBalanceFoundException extends Throwable
{
	
}
public class ThrowTest {

	public static void main(String[] args) throws NoBalanceFoundException {
		int bal=100;
if(bal>1000)
{
	System.out.println("You have money");
}
else
{
try
{
	NoBalanceFoundException n=new NoBalanceFoundException();
	throw n;
}catch(Throwable e)
{
	System.out.println("Handled");
	e.printStackTrace();
}

	}

	}
}
