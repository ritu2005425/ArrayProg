package PracticArrayList;

import java.util.ArrayList;

public class t18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>list=new ArrayList<Integer>();
		for(int i=0;i<50;i++)
		{
			list.add(i);
		}
		list.add(1, 44);
		System.out.println(list);
		
for(Integer item:list)
{
	if(item%2==0)
	{
		System.out.print(item);
	}
}
	}

}
