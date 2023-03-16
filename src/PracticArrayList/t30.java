package PracticArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class t30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(11);
		list.add(41);
		list.add(17);
		ArrayList<Integer> list2=new ArrayList<Integer>();
		list2=list;
	
		System.out.println(list2);
		Collections.sort(list,new mycomparator());
		System.out.println(list);
	}

}

class mycomparator implements Comparator<Integer>
{
	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return o2.compareTo(o1);
	}
	
}
