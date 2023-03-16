package ArraylistProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class one1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	ArrayList<Integer> list=new ArrayList<>(Arrays.asList(1,44,67,87));
	list.remove(1);
	System.out.println(list);
	list.removeAll(list);
	System.out.println(list);
		
for(Integer i:list)
		{
			System.out.print(" " +i);
		}
		for(int i=0;i<list.size();i++)
		{
			System.out.print(" " +list.get(i));
		}
		
		Iterator it=list.iterator();
	while(it.hasNext())
	{
		int i=(int) it.next();
		if(i%2==0)
		{
			it.remove();
		}
		if(i%2!=0)
		{
			System.out.println(i);
		}
		
	}
	}

}
