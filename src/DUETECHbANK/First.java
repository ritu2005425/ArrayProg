package DUETECHbANK;

class second
{
	public static void m1()
	{
		System.out.println("insatce block");
	}
static
{
	System.out.println("parent static");
}

second()
{
	System.out.println("inside consturtcor");
}


	
}

public class First extends second {
	static
	{
		System.out.println("second static");
	}
	
	First()
	{
		System.out.println("child constructor");
	}
	public static void main(String[] args) {
		
		

		// TODO Auto-generated method stub
		First f=new First();
		f.m1();

	}
	public static void m1()
	{
		System.out.println("second block");
	}
}
