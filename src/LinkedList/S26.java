package LinkedList;

import java.util.LinkedList;

public class S26 {

	public static void main(String[] args) {
		// 26. WAP to replace an element in a linked list.
		
		LinkedList<Integer> list=new LinkedList<Integer>();
		list.add(11);
		list.add(2);
		list.add(4);
		
		list.set(1, 67);
		System.out.println(list);

	}

}
