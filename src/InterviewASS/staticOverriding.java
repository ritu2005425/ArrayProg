package InterviewASS;
class par1
{
	
	public static void m1()
	{
		System.out.println("parent");
	}
}

class chil extends par1

{
	public static void m1()
	{
		System.out.println("child");
	}
}


public class staticOverriding {
public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	//chil c=new par1();
	par1 p=new par1();
	p.m1();
	par1 p1=new chil();
	p1.m1();
	
	}

}
