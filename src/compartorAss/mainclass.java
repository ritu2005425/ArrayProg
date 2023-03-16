package compartorAss;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<College> list=new ArrayList<College>();
		College c1=new College(1,"ritu",2);
		College c2=new College(2,"njn",4);
		College c4=new College(4,"oper",8);
		list.add(c1);
		list.add(c2);
		list.add(c4);
		Collections.sort(list, new College());
		//Collections.sort(list, new College() );
		System.out.println(list);
		}
}
class College implements Comparator<College>
{
	int id;
	String name;
	int age;
	public College(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "College [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	@Override
	public int compare(College o1, College o2) {
		Integer i=o1.age;
		Integer i2=o2.age;
		return i.compareTo(i2);
	}
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
	public College() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}