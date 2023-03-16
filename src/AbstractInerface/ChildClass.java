package AbstractInerface;


 class ParentClass
{
	int id;
	String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "ParentClass [id=" + id + ", name=" + name + "]";
	}
	public ParentClass(int id, String name) {
		super();
	  this.id = id;
		this.name = name;
		System.out.println("parent class constrctor called first"+id+" "+name);
	}
	
	
}



public class ChildClass extends ParentClass
{
	
	int age;
	int std;
	
	public ChildClass(int age, int std) {
		super(22, "yash");
		this.age = age;
		this.std = std;
		System.out.println("Child class constrctor called after parent "+age+" "+std);
	}

public static void main(String[] args) {
	ChildClass c=new ChildClass(2,5);
	

	}

}
