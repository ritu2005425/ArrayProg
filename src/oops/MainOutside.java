package oops;

class Student {

	int id;
	String name;
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
}

//MAIN METHOD OUTSIDE THE CLASS

public class MainOutside
{
	public static void main(String[] args) {
		

		Student s1=new Student(12,"tiy");
		
		Student s2=new Student(56,"tina");
		System.out.println(s1);
		System.out.println(s2);
		
	}
	
}
