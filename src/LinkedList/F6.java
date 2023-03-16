package LinkedList;

import java.util.LinkedList;

public class F6 {

	public static void main(String[] args) {
		// WAP to insert elements into the linked list at the first and last position
		LinkedList<String> list=new LinkedList<>();
		list.add("rijiu4");
		list.add("uifruf");
		list.add("nji");
		list.add("aji");
		list.add("bji");
		
	//5. WAP to insert the specified element at the specified position in the linked list.

		list.add(4, "FourthME");
		list.addFirst("firstME");
		list.addLast("lastme");
		System.out.println(list);

	}

}
