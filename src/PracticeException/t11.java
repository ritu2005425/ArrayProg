package PracticeException;

public class t11 {

	public static void main(String[] args) {
	
		m1();
	}
	public static int m1()
	{
		try
		{
			System.out.println("i amin try");
			return 30;
		}
		catch(Exception e)
		{
			System.out.println("is caught");
		}
		finally 
		{
		System.out.println("i amin funaaly");
		}
		return 8;
		
		
	}

}
