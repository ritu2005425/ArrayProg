package ArrayListReadOnly;
import java.util .*;
import java.util.ArrayList;

public class Readony {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<Integer> list=new ArrayList<>();
		list.add(1);
		list.add(11);
		list.add(21);
		System.out.println(list);
		
		List<Integer> list2=Collections.unmodifiableList(list);
	//	list2.add(45);
		System.out.println(list2);
		

	}

}
