package PracticeException;

public class t9 {

	public static void main(String[] args) {
		
		try
		{
			String s=null;
			System.out.println(s.length());
		}
		catch(Exception e)
		{
			System.out.println("NullPointerException caugh");
		}
		try
		{
			int arr[]=null;
			System.out.println(arr.length);
		}
		catch(Exception e)
		{
			System.out.println("NullPointerException caugh");
		}
	}

}
