package PracticeException;

public class t4 {

	public static void main(String[] args) {
		
		try
		{
			int a=12/0;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException is been caught");
		}
		catch(ArithmeticException e)
		{
			System.out.println("ArithmeticException is been caught");
		}

	}

}
