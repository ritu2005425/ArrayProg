package LinkedList;

import java.util.Arrays;
import java.util.LinkedList;

public class S2 {

	public static void main(String[] args) {
		// 2. WAP to iterate through all elements in a linked list.
		LinkedList<Integer> list=new LinkedList<Integer>(Arrays.asList(12,54,67,87));
		System.out.println(list);
	
		//using stream api an foreach loop
		list.stream().forEach(e->{
			System.out.println(e);
			});
	
	System.out.println("iterate over array using forEach loop");
	for(int i:list)
	{
		System.out.println(i);
	}
		

	}

}
