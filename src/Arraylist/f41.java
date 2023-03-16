package Arraylist;

import java.util.ArrayList;

public class f41 {

	public static void main(String[] args) {
		// 41. WAP to reverse elements in an ArrayList
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(12);
		list.add(89);
		list.add(100);
		for(int i=list.size()-1;i>=0;i--)
		{
			System.out.print(list.get(i)+" ");
		}
		

	}

}
