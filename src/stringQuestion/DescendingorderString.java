package stringQuestion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class DescendingorderString {

	public static void main(String[] args) {
		
		
		String[] str= {"keshac","prapti","ritu","reva","prithvi","chinu","opop"};
		//String chya aarayla list madh convert kele
//		int a[]= {56,2,24,667};
//		Arrays.sort(a);
		
		//System.out.println(Arrays.toString(a));
		
		ArrayList<String> list=new ArrayList<>(Arrays.asList(str));
		System.out.println(list);
		//ascending order ne print honar
		Collections.sort(list);
		System.out.println(list);
		//tyalach reverse kele mhne deceing jale
		Collections.reverse(list);
		System.out.println(list);
		
	}
}
