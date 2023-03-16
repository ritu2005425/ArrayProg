package Exception;

public class E8 {

	public static void main(String[] args) {
		// WAP to show the scenario in which IndexOutBound Exception (Both ArrayInexOutOfBound and 
	//	StringIndexOutOfBound) exception is generated and handle this exception.
		try
		{
			try
			{
				int a[]=new int[4];
				a[0]=6;
				System.out.println(a[7]);
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("ArrayIndexOutOfBoundsException caught");
			}
			try
			{
				String s="I am girl";
				System.out.println(s.charAt(17));
			}
			catch(StringIndexOutOfBoundsException e)
			{
				System.out.println("StringIndexOutOfBoundsException caught");
			}
		}
		catch(Exception e)
		{
			System.out.println("Handled all");
		}
		System.out.println("DONE");

	}

}
