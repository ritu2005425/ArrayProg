package LinkedList;

import java.util.LinkedList;

public class N9 {

	public static void main(String[] args) {
		// 9. WAP to insert some elements at the specified position into a linked list.
		LinkedList<String> list=new LinkedList<String>();
		list.add("ritu");
		list.add("tina");
		list.add("uma");
		list.offerLast("KOMAL");
		list.add(2, "secondElement");
		System.out.println(list);
	}

}
