package oops;
//MAIN METHOD INSIDE CLASS 
public class NewStudent {
	
	int id;
	String name;
	public NewStudent(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public static void callme()
	{
		System.out.println("hello");
	}
	@Override
	public String toString() {
		return "NewStudent [id=" + id + ", name=" + name + "]";
	}
	public static void main(String[] args) {
		
		NewStudent n=new NewStudent(12,"ritu");
		System.out.println(n);
		//n.callme();
		callme();

	}
	
	

}
