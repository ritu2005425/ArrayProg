package AssignmentCW;

import java.util.Arrays;

public class odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {12,45,2,67,89,46};
int b[]=new int[7];
int c[]=new int[6];
int k=0;
int j=0;
for(int i=0;i<a.length;i++)
{
	
	if(a[i]%2==0)
	{
		b[k]=a[i];
		k++;
	}
	else
	{
		c[j]=a[i];
		j++;
	}
}
System.out.println("even number array");
for(int i=0;i<k;i++)
{
	System.out.print(" "+ b[i]);
}
System.out.println(" ");
System.out.println("odd number array");
for(int i=0;i<j;i++)
{
	System.out.print(" "+c[i]);
}


	}

}
