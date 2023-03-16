package Arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class Eight8 {

	public static void main(String[] args) {
		// 8. WAP to remove element from ArrayList
		//9. WAP to remove all elements from ArrayList

		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(12);
		list.add(89);
		list.add(100);
		
		Collections.reverse(list);
		
		
		System.out.println(list);
		list.remove(1);
		System.out.println(list);
		
		//9. WAP to remove all elements from ArrayList
		list.removeAll(list);
		System.out.println(list);


	}

}
