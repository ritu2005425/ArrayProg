package PracticArrayList;

import java.util.ArrayList;

public class t8 {

	public static void main(String[] args) {
		// 8. WAP to remove element from ArrayList
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(11);
		list.add(41);
		list.add(17);
		list.remove(2);
		System.out.println(list);
		list.removeAll(list);
		System.out.println(list);
	}

}
