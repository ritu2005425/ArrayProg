package EXCEPTIONExample;

import java.io.IOException;

public class one1 {

	public static void main(String[] args)  {

		
		try
		{
			m1();
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		
	}
	public static void m1() 
	{
		int a[]=new int[] {1,2,4,5};
		System.out.println(a[8]);
		//System.out.println("i am atch");
	}

}
