package PracticLinkedList;

import java.util.ArrayList;
import java.util.LinkedList;

public class t19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> list=new LinkedList<>();
		list.add(12);
		list.add(45);
		list.addLast(67);
		//list.contains(12)
		System.out.println(list.peekFirst());
		System.out.println(list.peekLast());
  	System.out.println(list.removeFirst());
	System.out.println(list);
	
	ArrayList<Integer> arlist=new ArrayList<>(list);
	System.out.println(arlist);
	}

}
