package Exception;

import java.io.IOException;

public class j {

	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub
       m1();
	}
	
	
	public static void m1() throws Exception
	{
		int age=17;
		if(age<18)
		{
			throw new IOException("it is not valid");
		}
		else
		{
			System.out.println("good");
		}
	}

}
