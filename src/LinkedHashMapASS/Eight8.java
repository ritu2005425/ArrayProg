package LinkedHashMapASS;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Eight8 {

	public static void main(String[] args) {
//		8. Create LinkedHashMap which will have Student type key object and 
//		arraylist of course names for which Student admitted ie, like 
//		LinkedHashMap<Stuednt,ArrayList<Course>> . display list of courses for 
//		which student has enrolled
		
		ArrayList<Course> list=new ArrayList<Course>();
		list.add(new Course(1,"java"));
		list.add(new Course(2,"python"));
		list.add(new Course(4,"html"));	
		//System.out.println(list);
		
		Student st=new Student(1,"ritu");
		Student st1=new Student(2,"tina");
		
		LinkedHashMap<Student,ArrayList<Course>>map=new LinkedHashMap<Student,ArrayList<Course>>();
		map.put(st, list);
		map.put(st1, list);
		System.out.println(map);
	}

}
