package ArraylistProgram;

import java.util.ArrayList;
import java.util.Arrays;

public class conversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ARRAY TO LIST CONVERSION
		Integer[] a= {1,2,4,5,6,7,8};
		ArrayList<Integer>list=new ArrayList<>(Arrays.asList(a));
		System.out.println(list);
		
		//list to array
		ArrayList<Integer>list2=new ArrayList<>(Arrays.asList(5,6,7,8,24));
		Integer[]  arr=list2.toArray(new Integer[0]);
		System.out.println(Arrays.toString(arr));
			
		ArrayList<String>list4=new ArrayList<>(Arrays.asList("be","ifrb","bi"));
		
		//String[] arr2=list4.toArray(new String[0]);
		String[]  arr2=list4.toArray(new String[0]);
		System.out.println(Arrays.toString(arr2));
		
		
	}

}
