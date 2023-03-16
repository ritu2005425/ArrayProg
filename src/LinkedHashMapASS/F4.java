package LinkedHashMapASS;

import java.util.HashMap;

public class F4 {

	public static void main(String[] args) {
//	    Create a Map which contain Integer as key and Another Map as Value 
//		another Map Contain Emp as Key and Integer as value Print the Map 
//		using Iterator.

		Student s=new Student(1,"ritu");
		Student s1=new Student(2,"tina");
		Student s2=new Student(5,"revu");
		HashMap<Student,Integer>map=new HashMap<Student,Integer>();
		map.put(s, 12);
		map.put(s1, 14);
		map.put(s2, 44);
		
		System.out.println(map);
	//	HashMap<Integer,map>newMap=new HashMap<Integer,map>();

	}

}
