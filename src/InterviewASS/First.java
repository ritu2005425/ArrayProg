package InterviewASS;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Optional;

public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Person> p=new ArrayList<>();
		p.add(new Person(55, "Abc", 2000));
		p.add(new Person(62, "Avc", 4000));
		p.add(new Person(55, "uge", 5000));
		p.add(new Person(65, "Aqwh", 6000));
		
		int total=0;
//		Iterator<Person> itr=p.iterator();
//		while(itr.hasNext())
//		{
//			Person person=itr.next();
//			if(person.getAge()>60 && person.getName().startsWith("A"))
//			{
//				total=total+person.getSalary();
//			}
//		}
		
		p.stream().filter(e->e.getAge()>60 && e.getName().startsWith("A")).
		forEach(e->{
					System.out.println(e);
				});
		
		
//Integer c= p.stream().filter(e->e.getAge()>60 && e.getName().startsWith("A")).map(e->e.getSalary()).reduce((i,j)->i+j).get();

int c=p.stream().filter(e->e.getAge()>60 && e.getName().startsWith("A")).map(E->E.getSalary()).reduce((i,j)->i+j).get();
		
		
System.out.println(c);
	}

}


class Person
{
	int age;
	String name;
	int salary;
	public Person(int age, String name, int salary) {
		super();
		this.age = age;
		this.name = name;
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + ", salary=" + salary + "]";
	}
	
}