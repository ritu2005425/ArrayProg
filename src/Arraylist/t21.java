package Arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class t21 {

	public static void main(String[] args) {
		// 21. WAP to convert collection into array
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(12);
		list.add(89);
		list.add(100);
		
		Integer[] arr2= list.toArray(new Integer[0]);
		
		System.out.println(Arrays.toString(arr2));
		
//		Integer[] arr2=list.toArray(new Integer[0]);
//		for(int i=0;i<arr2.length;i++)
//		{
//			System.out.println(arr2[i]);
//		}
		
		
		
		int arr[]=new int[list.size()];
		for(int i=0;i<list.size();i++)
		{
			arr[i]=list.get(i);
			System.out.println(arr[i]);
		}
		
		ArrayList<String> list1=new ArrayList<String>();
		list1.add("rrhit");
		list1.add("nnr");
		list1.add("ioqw");
		
		String[] str=list1.toArray(new String[0]);
		for(int i=0;i<str.length;i++)
		{
			System.out.println(str[i]);
		}
		
	}

}
