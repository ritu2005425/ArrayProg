package AbstractInerface;


abstract class  Bike1
{
	Bike1()
	{
		System.out.println("This is my abstract class constructor");
	}
	
	abstract void run();
}
public class TestThink extends Bike1
{
public static void main(String[] args) {
	Bike1 b=new TestThink();
	b.run();
	}
	public void run() {
		System.out.println("implmented method in class");
		
	}
	void another()
	{
		System.out.println("it is method of child classs");
	}
}
