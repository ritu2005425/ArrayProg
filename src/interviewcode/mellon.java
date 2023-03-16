package interviewcode;

import java.util.Arrays;

public class mellon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[][]=new int[][] {
			{1,2},{4,5},{12,56},{78,56}
		};

		mellon b=new mellon();
		b.printnfo(a);

	}
	public void printnfo(int a[][])
	{
		
		//System.out.println();
		System.out.println(Arrays.toString(a));
		
	}

}
