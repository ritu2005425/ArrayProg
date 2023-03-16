package PracticeException;

public class t10 {

	public static void main(String[] args) {
	try
	{
		 m1();
	}
	catch(ArithmeticException e)
	{
		System.out.println("ArithmeticException is caught");
	}
	finally {
		System.out.println("finally executed");
	}
    
	}
	
	public static void m1()
	{
		  int a=7,b=0;
	       if(b==0)
	       {
	    	   throw new ArithmeticException("exception occcured");
	       }

	       else
	       {
	    	   System.out.println("not");
	       }
	}

}
