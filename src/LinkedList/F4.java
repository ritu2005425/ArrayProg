package LinkedList;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class F4 {

	public static void main(String[] args) {
		// 4. WAP to iterate a linked list in reverse order
LinkedList<String> list=new LinkedList<>();
list.add("rijiu4");
list.add("uifruf");
list.add("nji");
list.add("aji");
list.add("bji");
System.out.println(list);

Iterator it =list.descendingIterator();
while(it.hasNext())
{
	System.out.println(it.next());
}
//System.out.println(list);
//.sort(list);
//Collections.reverse(list);
//System.out.println(list);
	}

}
