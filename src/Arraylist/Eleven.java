package Arraylist;

import java.util.ArrayList;

public class Eleven {

	public static void main(String[] args) {
		// 11. WAP to know how many elements in ArrayList
		//12. WAP to test an ArrayList is empty or not
		//13. WAP to empty ArrayLis
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(12);
		list.add(89);
		list.add(100);
		int n=list.size();
		System.out.println(n);
		if(list.isEmpty())
		{
			System.out.println("it is empty");
		}
		else
		{
			System.out.println("it is not empty");
		}
		
		list.clear();
		//or list.removeAll(list)
		System.out.println(list);

	}

}
