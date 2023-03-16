package WrapperClasses;

public class First1 {

	public static void main(String[] args) {
		
		
//1.	Show one example of boxing and unboxing for all 8 primitive data types.
		
	int a=6;
	Integer i=Integer.valueOf(a);
	System.out.println(i);
//	Integer i=new Integer(a);
	double d=9;
	Double e=Double.valueOf(d);
	Long x = 56L;
	System.out.println(x.intValue());

	
//	double r=doubleValue(e);
	System.out.println(e);
	
	
	}

}
