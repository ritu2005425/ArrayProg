package Arraypro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class eight8 {

	public static void main(String[] args) {
		
		List<Integer> rt=List.of(54,12,57,57);
		Set<Object>set=Set.of(65,2,546);
	     System.out.println(set);
		System.out.println(rt);
	//	Collections.sort(rt);
		List<Integer> lst = Arrays.asList(11, 21, 3, 4, 5, 6, 7, 8, 9, 10);
		//Collections.sort(lst);
		System.out.println(lst);

		Integer arr[] = {23, 43, 25, 49, 12, 9, 78, 66, 39};
		List<Integer> fst=new ArrayList<>(Arrays.asList(arr));
		System.out.println("intger list "+ fst);
		
		
	String[] str= {"iruut","ebj","ruie"};
//		//List<Integer> list=new ArrayList<>(Arrays.asList(arr));
//		List<Integer> list2=new ArrayList<Integer>();
		
		List<String> list=new ArrayList<>(Arrays.asList(str));
		Collections.sort(list);
		Collections.reverse(list);
		System.out.println(list);
		
		
	}

}
