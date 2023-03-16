package PracticArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class t42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(11);
		list.add(41);
		list.add(17);
		Collections.reverse(list);
		System.out.println(list);
	}

}
