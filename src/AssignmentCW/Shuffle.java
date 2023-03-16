package AssignmentCW;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Shuffle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer[] arr= {1,4,56,12,76};
		List<Integer> list=Arrays.asList(arr);
		Collections.shuffle(list);
		list.toArray(arr);
		System.out.println(Arrays.toString(arr));
		
		//System.out.println(list.toString());
	}

}
