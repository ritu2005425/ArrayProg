package PracticLinkedList;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;

public class t1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList<Integer> list=new LinkedList<>();
list.add(12);
list.add(45);
list.addLast(67);
Iterator p=list.listIterator(1);
while(p.hasNext())
{
	System.out.println(p.next());
}
	}

}
