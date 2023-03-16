package Exception;

public class F1 {
	
	//1. WAP which throws ArrayIndexOutBoundsException. In the console, observe the stack trace and the 
	//line number from where the Exception is thrown
	//2. WAP to use catch / handle the ArrayIndexOutOfBoundsException exception.

	public static void main(String[] args) {
		try
		{
			m1();
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
			System.out.println("excecution happend smoothly");
		}
		

	}
	public static void m1() throws ArrayIndexOutOfBoundsException
	{
		int a[]=new int[4];
		a[4]=2;
		System.out.println(a[5]);
		
		
	}

}
