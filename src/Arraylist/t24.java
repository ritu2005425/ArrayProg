package Arraylist;

import java.util.ArrayList;

public class t24 {
	
	public static void main(String[] args) {
		//23. WAP to replace the second element of an ArrayList with the specified element
		
		ArrayList<Employee>list=new ArrayList<Employee>();
		list.add(new Employee(1,"ritu",20000));
		list.add(new Employee(2,"gitu",22222));
		list.add(new Employee(4,"titu",214));
		System.out.println(list);
		
	//	26. WAP to print Emp whose salary is > 10000
		for(Employee e1:list)
		{
			if(e1.sal>2000)
			{
				System.out.println(e1.name);
			}
	
		}
//		27. WAP to print Emp who have name "Ritu"
		for(Employee e1:list)
		{
			if(e1.name.equals("ritu"))
			{
				System.out.println(e1.id+" "+e1.name+" "+e1.sal);
			}
		
		}
		
		//28. WAP to print Emp who have highest number of salary
		int max=0;
		for(Employee e1:list)
		{
			if(e1.sal>max)
			{
				max=e1.sal;
			}
		
		}
		System.out.println("maximum salry "+max);


	}

}
