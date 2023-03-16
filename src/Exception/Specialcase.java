package Exception;

public class Specialcase {

	public static void main(String[] args) {
		//Nested try catch block
		try
		{
			try
			{
				int d=100/0;
			}
			catch(ArithmeticException e)
			{
				System.out.println(e);
				System.out.println("ArithmeticException handeled");
			} 
			try
			{
				int arr[]=new int[4];
				arr[0]=5;
				System.out.println(arr[7]);
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println(e);
			}
		}
		catch(Exception e)
		{
			System.out.println("all handled");
		}
		
		
	}

}
