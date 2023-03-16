package LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;

public class T23 {

	public static void main(String[] args) {
		// 23. WAP to convert a linked list to array list
		LinkedList<Integer> list=new LinkedList<Integer>();
		list.add(11);
		list.add(2);
		list.add(4);
		ArrayList<Integer> alist=new ArrayList<Integer>(list);
		for(Integer i:list)
		{
			System.out.println(i);
		}

	}

}
