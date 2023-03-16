package Arraylist;

import java.util.ArrayList;

public class n19 {

	public static void main(String[] args) {
		// WAP to match two collections
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(12);
		list.add(89);
		list.add(100);
		
		ArrayList<Integer> list1=new ArrayList<Integer>();
		list1.add(12);
		list1.add(89);
		list1.add(100);
		
		if(list.equals(list1))
		{
			System.out.println("equals");
		}
		else
		{
			System.out.println("not equals");
		}
		

	}

}
