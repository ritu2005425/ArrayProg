package PracticArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class thirtyfOUR  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(11);
		list.add(41);
		list.add(17);
		list.trimToSize();
		System.out.println(list.size());
		ArrayList<Integer> list2=(ArrayList<Integer>) list.clone();
		System.out.println(list2);
		list.ensureCapacity(6);
		list.add(2);
		list.add(89);
		
		System.out.println(list);
		
	}

}
