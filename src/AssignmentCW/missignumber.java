package AssignmentCW;

public class missignumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,2,4,5,6,7,8,10,12};
		int d;
		for(int i=0;i<a.length-1;i++)
		{
			
			d=a[i+1]-a[i];
			if(d!=1)
			{
				System.out.println(a[i+1]-1);
			}
			
		}

		
	}

}
