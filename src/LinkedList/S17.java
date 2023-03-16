package LinkedList;

import java.util.LinkedList;

public class S17 {

	public static void main(String[] args) {
		// 17. WAP to join two linked lists.

LinkedList<Integer> list=new LinkedList<Integer>();
list.add(1);
list.add(2);
list.add(4);
LinkedList<Integer> list1=new LinkedList<Integer>();
list1.add(11);
list1.add(22);
list1.add(44);
list.addAll(list1);
System.out.println(list);

	}

}
