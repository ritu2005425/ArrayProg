package Exception;

public class f4 {

	public static void main(String[] args) {
		// 4. WAP to show checked exception and use multiple catch block with universal Exception handler.

		
		try
		{
			int d=100/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println("ArithmeticException raised "+e);
		}
		catch(Exception e)
		{
			System.out.println("parent exception raise");
		}
		finally
		{
			System.out.println("clean the code");
		}
System.out.println("remaining code");
		
		
	}

}
