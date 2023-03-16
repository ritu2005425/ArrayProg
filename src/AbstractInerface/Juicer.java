package AbstractInerface;

public class Juicer extends Machine {

	public static void main(String[] args) {
		Juicer j=new Juicer();
		j.crush();
		j.filter();
		j.rotate();
		// TODO Auto-generated method stub

		Machine m=new Juicer();
		m.crush();
		m.rotate();
	// filter() method we can not call using parent reference variable
	}

	@Override
	public void crush() {
		System.out.println("I am in crush method");
		
	}
	
	public void filter()
	{
		System.out.println("I am in filter method");
	}

}
