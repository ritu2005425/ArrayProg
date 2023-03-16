package CTS;

class abc
{
	public void m1(String o)
	{
		System.out.println(o);
	}
	public void m1(Object o)
	{
		System.out.println(o);
	}
	
}


public class One {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		abc a=new abc();
		a.m1(null);
	}

}
