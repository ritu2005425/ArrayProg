package Arraylist;

import java.util.ArrayList;

public class Sixth {

	public static void main(String[] args) {
		// 6. WAP to iterate through all elements in an ArrayList using for each

		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(12);
		list.add(89);
		list.add(100);

		for(int i:list)
		{
			System.out.println(i);
		}

	}

}
