package LinkedList;

import java.util.LinkedList;
import java.util.ListIterator;

public class T3 {

	public static void main(String[] args) {
		// 3. WAP to iterate through all elements in a linked list starting at the specified position.
		
		LinkedList<String> list=new LinkedList<String>();
		list.add("ritu");
		list.add("preeti");
		list.add("opop");
		list.add("kusum");
	//	System.out.println(list);
		
		ListIterator itr = list.listIterator(2);
		while(itr.hasNext())
		{
			String s=(String) itr.next();
			System.out.println(s);
		}
		
	}

}
