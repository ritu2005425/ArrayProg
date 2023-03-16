package PracticeAssHashMap;

import java.util.LinkedHashMap;

public class t2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashMap<Emp, Integer> map=new LinkedHashMap<Emp, Integer>();
		Emp e1=new Emp(1, "RITU", 12);
		Emp e2=new Emp(2, "gITU", 11);
		Emp e4=new Emp(4, "sweet", 14);
		map.put(e1, e1.getId());
		map.put(e2, e2.getId());
		map.put(e4, e4.getId());
		System.out.println(map);
		

	}

}

class Emp
{
	int id;
	String name;
	int age;
	
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Emp(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
	
	
}
