package PracticArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class t4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(11);
		list.add(41);
		list.add(17);
		Iterator<Integer> itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}

}
