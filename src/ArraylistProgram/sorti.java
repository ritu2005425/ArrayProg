package ArraylistProgram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class sorti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Integer> list=new ArrayList<Integer>();
list.add(122);
list.add(45);
list.add(65);
list.add(90);

Collections.sort(list);
System.out.println("soreted "+list);

Collections.sort(list,new mycompartaor());
System.out.println(list);
	}

}

class mycompartaor implements Comparator<Integer>
{
@Override
	public int compare(Integer o1, Integer o2) {
				return o2.compareTo(o1);
	}
	
}