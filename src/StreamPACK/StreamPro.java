package StreamPACK;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;
import java.util.stream.*;
public class StreamPro {

	public static void main(String[] args) {
		
	ArrayList<Integer> list=new ArrayList<>();
	list.add(2);
	list.add(12);
	list.add(22);
	list.add(52);
	
	List<Integer> list2=list.stream().map(e->e*2).collect(Collectors.toList());
	System.out.println(list2);
	
	
	
	list.stream().map(e->e*2).forEach(r->{
		System.out.println(r);
	});

	}

}
