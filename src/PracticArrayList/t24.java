package PracticArrayList;

import java.util.ArrayList;

public class t24 {

	public static void main(String[] args) {
		// 24. WAP to create Emp (id,name,sal) object and add 2objects to ArrayList. Sysout and see both variable 
ArrayList<Emp> list=new ArrayList<Emp>();
list.add(new Emp(1,"ritu",40000));
list.add(new Emp(2,"era",20000));
list.add(new Emp(5,"gudu",60000));
System.out.println(list);

for(Emp e:list)
{
	if(e.sal>50000)
	{
		System.out.println(e.name);
	}
}
for(Emp e:list)
{
	if(e.name.equals("ritu")) {
		System.out.println(e);
	}
}
int max=0;
String sname=null;
	for(Emp e:list)
	{
	if(e.sal>max)
	{
		max=e.sal;
		sname=e.name;
	}
	}
	System.out.println(max+" "+sname);
}
}

class Emp
{
	int id;
	String name;
	int sal;
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Emp(int id, String name, int sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}
	

}
