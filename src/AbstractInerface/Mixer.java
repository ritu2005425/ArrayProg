package AbstractInerface;

public abstract class Mixer extends Machine {
	
	public void crush()
	{
		System.out.println("crush called");
	}
	
	public void blend()
	{
		System.out.println("blend called");
	}
	public static void main(String[] args) {
		
		//ABSTRACT class object can not be created
		//Mixer m=new Mixer();
	}
	
}
