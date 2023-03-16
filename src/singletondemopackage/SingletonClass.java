package singletondemopackage;


class Student
{
	static Student s=new Student();
	private Student()
	{
		System.out.println("constructor called once");
	}
	
	public static Student getme()
	{
		return s;
	}
	
}

public class SingletonClass {

	public static void main(String[] args) {
		Student s1=Student.getme();
		
		//if we try to create new student object it will give you error like this 
		//Student s2=new Student();
		
		// TODO Auto-generated method stub

	}
}
