package AbstractInerface;

abstract class Parent {
		 
	public abstract void cook();
	public void wash()
	{
		System.out.println("Inside wash method");
	}
}

 public class Child extends Parent
{
	public static void main(String[] args) {
		Child c=new Child();
		c.wash();
		c.cook();
	}

	@Override
	public void cook() {
		System.out.println("Inside Cook method");
	}
}
