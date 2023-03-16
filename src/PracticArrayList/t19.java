package PracticArrayList;

import java.util.ArrayList;

public class t19 {

	public static void main(String[] args) {
		// . WAP to convert collection into array
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(11);
		list.add(41);
		list.add(17);
		ArrayList<Integer> list2=new ArrayList<Integer>();
		list2.add(1);
		list2.add(11);
		list2.add(41);
		list2.add(17);
		if(!list2.isEmpty())
		{
			System.out.println("no");
		}
		if(list.equals(list2))
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("no");
		}
	}

}
