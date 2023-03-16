package Arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class Fourth {

	public static void main(String[] args) {
		// 4. WAP to print all elements of ArrayList using iterator
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(12);
		list.add(89);
		list.add(100);
		Iterator<Integer> itr=list.iterator();
		while(itr.hasNext())
		{
		//	
		//	System.out.println(itr.next());
			Integer i=itr.next();
			System.out.println(i);
		}
		

	}

}
