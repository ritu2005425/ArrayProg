package Exception;

public class Unchecked {

	//23. WAP to use try catch finally and in close operation again try catch to be used.

	public static void main(String[] args) {
		
		m1();
		
	}
	
public static void m1()
	{
		int age=17;
		if(age<18)
		{
			throw new ArithmeticException("it if going wrong");
		}
	}

}
