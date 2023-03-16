package LinkedList;

import java.util.Collections;
import java.util.LinkedList;

public class F15 {

	public static void main(String[] args) {
		// 15. WAP of swap two elements in a linked list.
		LinkedList<Integer> list=new LinkedList<Integer>();
		list.add(1);
		list.add(4);
		list.add(6);
		list.add(7);
		list.add(8);
		System.out.println(list);
		int arr[]=new int[list.size()];
		for(int i=0;i<list.size();i++)
		{
			arr[i]=list.get(i);
		}
//		int a=1;
//		int b=4;
//		int temp;
//		temp=arr[a];
//		arr[a]=arr[b];
//		arr[b]=temp;
//		for(int i=0;i<list.size();i++)
//		{
//			System.out.print(arr[i]+ " ");
//		}
		Collections.swap(list, 0, 2);
		System.out.println(list);
		
		
	}

}
