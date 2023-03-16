package LinkedList;

import java.util.LinkedList;

public class E11 {

	public static void main(String[] args) {
		// 11. WAP to display the elements and their positions in a linked list.
		LinkedList<String> list=new LinkedList<String>();
		list.add("ritu");
		list.add("tina");
		list.add("uma");
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i) +" "+i);  
		}

	}

}

