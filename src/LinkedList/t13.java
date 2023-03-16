package LinkedList;

import java.util.LinkedList;

public class t13 {
	public static void main(String[] args) {
		//13. WAP to remove first and last element from a linked list.

		LinkedList<String> list=new LinkedList<String>();
		list.add("ritu");
		list.add("tina");
		list.add("uma");
		list.removeLast();
		System.out.println(list);
		list.removeFirst();
		System.out.println(list);
		
	}
}
