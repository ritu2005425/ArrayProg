package Exception;

public class e11 {

	public static void main(String[] args) {
		// 11. WAP to return int value in try block and return int value in finally block and observe which return 
	//	takes precedence
		m1();
		
	}
	public static int m1()
	{
       
		try
		{
			System.out.println("I am in try block");
			   return 30;
		}
		
		finally 
		{
		System.out.println("I am in finally block");	
		}
	}

}
