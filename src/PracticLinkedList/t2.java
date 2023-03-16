package PracticLinkedList;

import java.util.Collections;
import java.util.LinkedList;

public class t2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//4. WAP to iterate a linked list in reverse order.
		LinkedList<Integer> list=new LinkedList<>();
		list.add(12);
		list.add(45);
		list.addLast(67);
//		Collections.reverse(list);
//		System.out.println(list);
	Collections.swap(list, 1, 2);
	System.out.println(list);
		for(int i=list.size()-1;i>=0;i--)
		{
			System.out.println(list.get(i));
		}
	}

}
