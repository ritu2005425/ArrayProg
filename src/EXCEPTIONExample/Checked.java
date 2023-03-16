package EXCEPTIONExample;

import java.io.IOException;

public class Checked {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub

		
		try {
			m1();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("catched "+e);
		//	e.printStackTrace();
		}
	}
public static void m1() throws IOException
{

	int age=19;
	if(age>18)
	{
		throw new IOException("exception raised");
	}
}
}
