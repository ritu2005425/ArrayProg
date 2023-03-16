package LinkedList;

import java.util.LinkedList;

public class T21 {

	public static void main(String[] args) {
		// 21. WAP to retrieve but does not remove, the last element of a linked list.
		LinkedList<Integer> list=new LinkedList<Integer>();
		list.add(11);
		list.add(2);
		list.add(4);
	
		int i=list.peekLast();
		System.out.println("last element of list "+i);
		System.out.println("Our whole list "+list);
	}

}
