package LinkedList;

import java.util.LinkedList;

public class E18 {

	public static void main(String[] args) {
		//18. WAP to clone a linked list to another linked list.

		LinkedList<Integer> list=new LinkedList<Integer>();
		list.add(1);
		list.add(2);
		list.add(4);
		
		LinkedList<Integer> list1=new LinkedList<Integer>();
		list1=(LinkedList<Integer>) list.clone();
		System.out.println(list1);
		
	}

}
