package LinkedList;

import java.util.LinkedList;

public class F14 {

	public static void main(String[] args) {
		// 14. WAP to remove all the elements from a linked list.
		LinkedList<String> list=new LinkedList<String>();
		list.add("ritu");
		list.add("preeti");
		list.add("opop");
		list.removeAll(list);
		System.out.println("list is" + list);
	}

}
