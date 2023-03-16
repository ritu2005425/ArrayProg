package PracticeException;

public class t2 {

	public static void main(String[] args) {
		try
		{
			int a[]=new int[4];
			a[0]=1;
			a[1]=4;
			System.out.println(a[7]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		System.out.println("executed");
		
	}

}
