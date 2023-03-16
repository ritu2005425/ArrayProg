package AssignmentCW;

public class five5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {2,4,5,6,7};
double b[]= {4.5,6.7,1.2};
int result=average(a);
System.out.println(result);
double t=average(b);
System.out.println(t);
	}
	
	public static int average(int a[])
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum+=a[i];
		}
		return sum;
	}
	public static double average(double b[])
	{
		double sum=0;
		for(int i=0;i<b.length;i++)
		{
			sum+=b[i];
		}
		return sum;
	}

}
