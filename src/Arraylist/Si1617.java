package Arraylist;

import java.util.ArrayList;

public class Si1617 {

	public static void main(String[] args) {
		//16. WAP to retrieve an element (at a specified index) from a given ArrayList
	//	17. WAP to insert an element into the ArrayList at the first position
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(12);
		list.add(89);
		list.add(100);
		System.out.println(list.get(1));
		list.add(0, 45);
		System.out.println(list);

	}

}
