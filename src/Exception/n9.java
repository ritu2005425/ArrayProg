package Exception;

public class n9 {

	public static void main(String[] args) {
		// WAP to show 3 different scenario in which null pointer exceptions generated, and handle that exception
		
		try
		{
	//5. NullPointerException when getting the length of null String

			
			String s=null;
			System.out.println(s.length());
		}
		catch(NullPointerException e)
		{
			System.out.println("NullPointerException caught");
		}
		
		// NullPointerException when getting the length of null array
		try
		{
			int[] data = null;
			System.out.println(data.length);
		}
		catch(NullPointerException e)
		{
			System.out.println("NullPointerException caught");
		}
		
		// NullPointerException when accessing index value of null array
		try
		{
			int[] data = null;
			System.out.println(data[6]);
		}
		catch(NullPointerException e)
		{
			System.out.println("NullPointerException caught");
		}
		
		
		
	}

}
