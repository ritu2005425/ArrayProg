package LinkedList;

import java.util.Collections;
import java.util.LinkedList;

public class S16 {

	public static void main(String[] args) {
		// 16. WAP to shuffle the elements in a linked list.
		
		LinkedList<Integer> list=new LinkedList<Integer>();
		list.add(1);
		list.add(4);
		list.add(6);
		list.add(7);
		System.out.println(list);
		Collections.shuffle(list);
		System.out.println(list);

	}

}
