package AssignmentCW;

public class duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {12,4,12,5,6,7,8,12,5,6};

for(int i=0;i<a.length;i++)
{
	boolean flag=true;
	for(int j=i-1;j>=0;j--)
	{
		if(a[i]==a[j])
		{
			flag=false;
		}
	}
	if(flag)
	{
		int c=1;
		for(int k=i+1;k<a.length;k++)
		{
			if(a[i]==a[k])
			{
				c++;
			}
		}
		if(c==1)
		{
			System.out.println(a[i]+" : "+c);
		}
		
	}
}

	
	
	}

}
