package Exception;

public class s17 {

	public static void main(String[] args) throws Exception {
		// WAP to show throw and throws keyword. 
		try
		{
			m1();
		}
		catch(ArithmeticException e)
		{
			System.out.println("caught");
		}
		
		m2();
		
		
	}
	public static void m1() throws ArithmeticException
	{
	 int d=10/0;
	}
	
	public static void m2() throws Exception 
	{
		throw new Exception();
	}
	

}
