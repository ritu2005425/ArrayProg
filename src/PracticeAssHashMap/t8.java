package PracticeAssHashMap;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class t8 {
	
	public static void main(String[] args)
	{
		LinkedHashMap<Students, ArrayList<Courses>> m=new LinkedHashMap<Students, ArrayList<Courses>>();
		ArrayList<Courses> list=new ArrayList<Courses>();
				
		list.add(new Courses("Physics"));
		list.add(new Courses("chemistry"));
		list.add(new Courses("Maths"));

		m.put(new Students(1,"ritu"), list);
		m.put(new Students(2,"hem"), list);
		System.out.println(m);
	}
}

class Students
{
	int id;
	String name;
	public Students(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Students() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Students [id=" + id + ", name=" + name + "]";
	}
	
}
class Courses
{
	String name;

	public Courses(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Courses [name=" + name + "]";
	}

	public Courses() {
		super();
		// TODO Auto-generated constructor stub
	}
}






