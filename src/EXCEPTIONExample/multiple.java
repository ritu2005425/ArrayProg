package EXCEPTIONExample;

public class multiple {

	public static void main(String[] args) {
try
{
	m1();// TODO Auto-generated method stub
}
catch(ArrayIndexOutOfBoundsException e)
{
	System.out.println(e);
}
catch(ArithmeticException e)
{
	System.out.println(e);
}
	}
	
	public static void m1()
	{
		//int a=10/0;
	int[] b=new int[] {1,2,4,5};
	System.out.println(b[8]);
	}

}
