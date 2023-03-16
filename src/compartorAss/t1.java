package compartorAss;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class t1 {

	public static void main(String[] args) {
		
ArrayList<Student> list=new ArrayList<Student>();
list.add(new Student(12,"ritu",21));
list.add(new Student(11,"hema",24));
list.add(new Student(10,"lata",50));
Collections.sort(list,new Student());

System.out.println(list);
	}

}

class Student implements Comparator<Student>
{
int rollNo;
String name;
int age;
@Override
public String toString() {
	return "Student [rollNo=" + rollNo + ", name=" + name + ", age=" + age + "]";
}
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
public Student(int rollNo, String name, int age) {
	super();
	this.rollNo = rollNo;
	this.name = name;
	this.age = age;
}
//@Override
//public int compare(Student o1, Student o2) {
//	return o1.name.compareTo(o2.name);
//}
//@Override
//public int compare(Student o1, Student o2) {
//Integer i=o1.age;
//Integer i2=o2.age;
//	return i.compareTo(i2);
//}
@Override
public int compare(Student o1, Student o2) {
Integer i=o1.rollNo;
Integer i2=o2.rollNo;
	return i.compareTo(i2);
}


}
