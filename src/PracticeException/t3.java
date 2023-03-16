package PracticeException;

public class t3 {

	public static void main(String[] args) {
		
		try
		{
			try
			{
				int a=45/0;
			}
			catch(ArithmeticException e)
			{
				System.out.println("ArithmeticException is caugh");
			}
			
			try
			{
				int a[]=new int[4];
				System.out.println(a[7]);
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("ArrayIndexOutOfBoundsException is caugh");
			}
		}

	catch(Exception e)
		{
		e.printStackTrace();
		}
		System.out.println("handed");
	}

}
