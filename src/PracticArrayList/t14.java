package PracticArrayList;

import java.util.ArrayList;

public class t14 {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(11);
		list.add(41);
		list.add(17);
		if(list.contains(11))
		{
			System.out.println("yes prenset");
		}
		else
		{
			System.out.println("not present");
		}
	}

}
