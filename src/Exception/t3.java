package Exception;

public class t3 {

	public static void main(String[] args) {
		// 3. WAP to catch multiple exceptions. i.e ArrayIndexOutOfBoundsException and ArithmeticException
		try
		{
			m1();
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
			System.out.println("ArithmeticException resolved");
			
			
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
			System.out.println("ArrayIndexOutOfBoundsException resolved");
		}
		
	}
	
	public static void m1() throws ArithmeticException,ArrayIndexOutOfBoundsException
	{
		
		int a[]=new int[4];
		a[0]=2;
		
	//	int d=100/0;
		System.out.println(a[5]);
	}

}
