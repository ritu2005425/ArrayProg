package stringQuestion;

public class NUMBER {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=124;
		int r;
		int s=0;
		int n;
//		while(a>0)
//		{
//			r=a%10;
//			s=s+r;
//			a=a/10;		
//		}
//		System.out.println("sum is ="+s);
		
		while(a>0)
		{
			r=a%10;
			s=s*10+r;          
			a=a/10;		
		}
		System.out.println("reverse  is ="+s);
	}

}
