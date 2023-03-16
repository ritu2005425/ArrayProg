package LinkedList;

import java.util.LinkedList;

public class S7 {

	public static void main(String[] args) {
		// 7. WAP to insert the specified element at the front of a linked list.
		
		LinkedList<String> list=new LinkedList<String>();
		list.add("ritu");
		list.add("tina");
		list.add("uma");
		System.out.println(list);
		
		list.offerFirst("Soniya");
		System.out.println(list);
		
       list.offer("uoi");
       System.out.println(list);
       list.offerLast("komal");
       System.out.println(list);

	}

}
