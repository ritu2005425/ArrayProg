package Arraypro;

public class five5 {
public static void main(String[] args) {
		// TODO Auto-generated method stub
	int a[][]={
			{22, 31, 9}, {12, 25, 16}
			};
	
	
//	System.out.println(n);
	for(int i=0;i<2;i++)
	{
		int max=a[0][0];
		for(int j=0;j<3;j++)
		{
			if(a[i][j]>max)
			{
				max=a[i][j];
			}
		}
		System.out.println(max);
	}
	}
}
