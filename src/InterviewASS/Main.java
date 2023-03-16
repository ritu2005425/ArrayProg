package InterviewASS;


class parent
{
	
	public void m1()
	{
		System.out.println("parent");
	}
}

class child extends parent

{
	public void m1()
	{
		System.out.println("child");
	}
}

public class Main {

	public static void main(String[] args) {
		child c=new child();
		c.m1();
		parent p=new child();
		p.m1();
		parent p1=new parent();
		p1.m1();	
	//	child c2=new parent();  //child class reference can not be used to store parent object
		
	}

}
