package AssignmentCW;

public class sumofeachrow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {
				{11,1,1},{1,11,1},{1,1,11}};
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(" "+a[i][j]);
				
			}
			System.out.println("");
		}
		int add;
		int l=0;
		
		int max = 0;
		for(int j=0;j<3;j++)
		{
			
			add = 0;
			for(int i=0;i<3;i++)
			{
				
				max=a[j][0];
				if(a[i][j]>max)
				{
					max=a[i][j];
				}
				System.out.println(a[i][j]);
				add+=a[i][j];
			}
			System.out.println("max number is  "+max);
			System.out.println("sum of column is "+ add);
			
		}
		
		int sum;
		for(int i=0;i<3;i++)
		{
			sum=0;
			for(int j=0;j<3;j++)
			{
				sum=sum+a[i][j];
				
			}
			System.out.print("sum os rows "+sum);
			System.out.println("");
		}
		System.out.println("Diagonal elements are");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(i==j)
				System.out.print(" "+ a[i][j]);
				
			}
			//System.out.println("");
		}
		
	}

}
