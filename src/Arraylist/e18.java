package Arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class e18 {

	public static void main(String[] args) {
		// 18. WAP to add 1 to 50 numbers in ArrayList and print only even numbers (using iterator)

ArrayList<Integer> arr=new ArrayList<Integer>();
for(int i=1;i<=50;i++)
{
	arr.add(i);
}

Iterator<Integer>itr =arr.iterator();
while(itr.hasNext())
{
	int i=itr.next();
	if(i%2==0)
	{
		System.out.print(i+" ");
	}
}
System.out.println(" ");
arr.stream().filter(i->i%2==0).forEach(t->{
	System.out.print(t+" ");
});
	
	

}

}
