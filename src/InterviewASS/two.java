package InterviewASS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import ArraylistProgram.Hashmap;

public class two {

	public static void main(String[] args) {

		List<Integer> list=Arrays.asList(12,45,67,87,88);
		System.out.println("ascending order");
		list.stream().sorted().forEach(e->{
			System.out.print(" " +e);
		});
		System.out.println(" ");
		System.out.println("|descending order");
		
		list.stream().sorted(Collections.reverseOrder()).forEach(r->{
			System.out.print(" " +r);
		});
		System.out.println(" ");
		System.out.println("max number");
		
		int k=list.stream().max((i,j)->i.compareTo(i)).get();
		
		System.out.println(k);
		
		Optional<Integer> min=	list.stream().min((i,j)->i.compareTo(j));
		System.out.println(min.get());	
		
		Optional<Integer> m=	list.stream().reduce((i,j)->i+j);
		System.out.println(m.get());
		
		
		String[] str=new String[] {"ritu","ritu","uhehe","euhuie","abc","abc"};
		List<String> strlist=Arrays.asList(str);
		Set<String> collect = strlist.stream().filter(e->Collections.frequency(strlist, e)>1).collect(Collectors.toSet());
		System.out.println(collect);
		
		HashMap<String,Integer> map=new HashMap<String,Integer>();
		
		
		
		
	
			
		
	}

}
