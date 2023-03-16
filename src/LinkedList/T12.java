package LinkedList;

import java.util.LinkedList;

public class T12 {

	public static void main(String[] args) {
		// 12. WAP to remove a specified element from a linked list.
		LinkedList<String> list=new LinkedList<String>();
		list.add("ritu");
		list.add("tina");
		list.add("uma");
		list.remove("tina");
		System.out.println(list);
	}

}
