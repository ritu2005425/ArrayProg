package Arraylist;

import java.util.ArrayList;

public class dou14 {

	public static void main(String[] args) {
		// 14. WAP to search an element from ArrayList

		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(12);
		list.add(89);
		list.add(100);
		if(list.contains(12))
		{
			System.out.println("found");
		}
		else
		{
			System.out.println("not found");
		}
		
		ArrayList<Integer> list1=new ArrayList<Integer>();
		list1.add(12);
		list1.add(88);
		if(list.containsAll(list1))
		{
			System.out.println("found");
		}
		else
		{
			System.out.println("not found");
		}
	}

}
