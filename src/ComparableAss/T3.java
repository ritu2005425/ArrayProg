package ComparableAss;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class T3 {

public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Employee> list=new ArrayList<Employee>();

list.add(new Employee("ritu","software enginner",21) );
list.add(new Employee("revu","developer",12) );
list.add(new Employee("gitu","tariner",1) );

Collections.sort(list);

System.out.println(list);
}
}

class Employee implements Comparable<Employee>
{
	String name;
	String designation;
	int age;
	public Employee(String name, String designation, int age) {
		super();
		this.name = name;
		this.designation = designation;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", designation=" + designation + ", age=" + age + "]";
	}
	@Override
//	public int compareTo(Employee o) {
//		if(this.age>o.age)
//		{
//			return +1;
//		}
//		else if(this.age<o.age)
//		{
//			return -1;
//		}
//		else
//		{
//			return 0;
//		}
		
	public int compareTo(Employee o) {
			return this.name.compareTo(o.name);
		}
	
	
	
}
