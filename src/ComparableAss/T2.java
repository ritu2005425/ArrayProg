package ComparableAss;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class T2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(121);
		list.add(4);
		Collections.sort(list);
		System.out.println(list);
	}

}
