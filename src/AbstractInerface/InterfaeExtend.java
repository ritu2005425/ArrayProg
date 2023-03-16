package AbstractInerface;


interface able
{
	public abstract void m1();
}

interface cable extends able
{
	public abstract void m1();
}
 
public class InterfaeExtend implements cable
{
	@Override
	public void m1() {
		System.out.println("gooo");
		
	}
	
	public static void main(String[] args) {
		cable c=new InterfaeExtend();
		c.m1();
		System.out.println("it is go");
	}

}
