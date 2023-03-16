package LinkedList;

import java.util.LinkedList;

public class T10 {

	public static void main(String[] args) {
		//10. WAP to get the first and last occurrence of the specified elements in a linked list.
		LinkedList<String> list=new LinkedList<String>();
		list.add("ritu");
		list.add("tina");
		list.add("uma");
		list.add("komal");
		list.add("kajol");
		list.add("uma");
		list.add("tina");
		String e="tina";
		int g=list.indexOf(e);
		System.out.println("first index of "+g);
		
		String s="uma";
		int t=list.lastIndexOf(s);
		System.out.println("last indexof t "+ t);

	}

}
