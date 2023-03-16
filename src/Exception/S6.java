package Exception;

public class S6 {

	public static void main(String[] args) {
		// WAP to show unchecked exception
		
	//	int d=10/0;
		try
		{
			String s=null;
			if(s.equals("hello"))
			{
				System.out.println("yes");
			}
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
			System.out.println("Handeld");
		}
		
		System.out.println("REMAINING CODE");
	}

}
