package PracticeException;

public class t8 {

	public static void main(String[] args) {
	
		try
		{
			try
			{
				int a[]=new int[2];
				System.out.println(a[9]);
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("ArrayIndexOutOfBoundsException caught");
			}
			try
			{
				String s = "ritu";
				System.out.println(s.charAt(11));
			}
			catch(StringIndexOutOfBoundsException e)
			{
				System.out.println("StringIndexOutOfBoundsException caught");
			}
			
		}
catch(Exception e)
		{
	
		}
	}

}
