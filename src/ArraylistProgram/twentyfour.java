package ArraylistProgram;

import java.util.ArrayList;
import java.util.Iterator;

public class twentyfour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Emp> list=new ArrayList<>();
		Emp e=new Emp(1,"ritu",55000);
		Emp e2=new Emp(2,"tina",40000);
		Emp e4=new Emp(4,"yashodha",20000);
		list.add(e);
		list.add(e2);
		list.add(e4);
		System.out.println(list);
		
		Iterator<Emp> itr=list.iterator();
		while(itr.hasNext())
		{
			Emp r=itr.next();
			if(r.getSal()>40000)
			{
				System.out.println(r.getName());
			}
			
		}
		int max=list.get(0).getSal();

		for(int i=0;i<list.size();i++)
		{
			if(list.get(i).getSal()>max)
			{
				max=list.get(i).getSal();
			}
		}
		
		System.out.println(max);
		
		
	}

}
