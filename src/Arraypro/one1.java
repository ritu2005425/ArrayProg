package Arraypro;

import java.util.Arrays;
import java.util.Scanner;

public class one1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		System.out.println("enter elements of arrays");
		for(int i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
		}
		
		int temp;
	
		for(int i=0;i<5;i++)
		{
			for(int j=i+1;j<5;j++)
			{
				if(a[i]<a[j])
				{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
		System.out.println("second max element is= " +a[1]);

	}

}
