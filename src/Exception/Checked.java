package Exception;

import java.io.IOException;

public class Checked {

	public static void main(String[] args) throws IOException {
		
			m1();
	}

	
	public static void m1() throws IOException
	{
		int age=17;
		if(age<18)
		{
			throw new IOException("This is checked exception");
		}
		
	}
}
