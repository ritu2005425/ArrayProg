package Exception;

public class t10 {

	public static void main(String[] args) {
		// WAP to throw exception still finally should get executed
		try
		{
			int a=10/0;
		}
	catch(ArithmeticException e)
		{
		throw new ArithmeticException("handle it");
		}
		finally
		{
			System.out.println("final block");
		}
		
	}
	

}
