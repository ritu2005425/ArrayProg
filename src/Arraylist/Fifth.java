package Arraylist;

import java.util.ArrayList;

public class Fifth {

	public static void main(String[] args) {
		// 5. WAP to iterate through all elements in an ArrayList using for loop

		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(12);
		list.add(89);
		list.add(100);
		
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
//		for(int i:list)
//		{
//			System.out.println(i);
//		}
	}

}
