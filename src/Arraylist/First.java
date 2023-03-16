package Arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class First {

	public static void main(String[] args) {
		// WAP to add elements to arraylist without using generics (no <>) and print content of it where 
		//Integer is used. In second arraylist String is used
//		List list=new ArrayList();
//		
//		Set<Integer> s=new HashSet<>(Arrays.asList(0,0,1,1,2,2,0,0,1));
//		List<Integer> l=new ArrayList<>(s);
////		Collections.sort(l);
////		System.out.println("set field");
////		System.out.println(l);
////		
////		Set<Integer> set=new HashSet<>(Arrays.asList(1,2,5,6,8));
//		
// 		list.add(1);
//		list.add(2);
//		list.add(4);
//		list.add("ritu");
//		Collections.sort(list);
//		System.out.println(list);
		
		List<Integer> list=new ArrayList<>(Arrays.asList(11,2,45,5,6,1,2,1));
		System.out.println(list);
		Collections.sort(list);
		
		System.out.println(list);
		HashSet<Integer> set=new HashSet<>(list);
	
		set.stream().sorted().forEach(e->System.out.print(e));
		//System.out.println(set);

	}

}
