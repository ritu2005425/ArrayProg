package PracticArrayList;

import java.util.ArrayList;

public class t15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(11);
		list.add(41);
		list.add(17);
	
		System.out.println(list.get(2));
		ArrayList<Integer> list2=new ArrayList<Integer>();
		list2.add(1);
		list2.add(11);
		if(list.containsAll(list2))
		{
			System.out.println("yes contains");
		}
		else
		{
			System.out.println("not");
		}
		
	}

}
