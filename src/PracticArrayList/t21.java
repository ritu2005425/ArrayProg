package PracticArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class t21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(11);
		list.add(41);
		list.add(17);
		
		int c[]=new int[list.size()];
		list.toArray();	
		
	Collections.swap(list, 1, 2);
	System.out.println(list);
		int arr[]=new int[list.size()];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=list.get(i);
			System.out.print(arr[i]+" ");
		}
	}

}
