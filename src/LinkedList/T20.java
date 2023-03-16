package LinkedList;

import java.util.LinkedList;

public class T20 {

	public static void main(String[] args) {
		//20. WAP to retrieve but does not remove, the first element of a linked list
		LinkedList<Integer> list=new LinkedList<Integer>();
		list.add(11);
		list.add(2);
		list.add(4);
		int i=list.peekFirst();
		System.out.println("first element of list "+i);
		System.out.println("Our whole list "+list);
		
	}

}
