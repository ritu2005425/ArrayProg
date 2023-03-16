package stringQuestion;

public class TwentyEight {

	public static void main(String[] args) {
		// 28.	Write a Java program to find lowest frequency character in a string.
		int min=1;
		int x=0;
		String s="ii amm ggoodd";
		for(int i=0;i<s.length();i++)
		{
			boolean flag =true;
			for(int k=i-1;k>=0;k--)
			{
				if(s.charAt(i)==s.charAt(k))
				{
					flag=false;
				}
			}
			if(flag)
			{
				int c=1;
				for(int j=i+1;j<s.length();j++)
				{
					if(s.charAt(i)==s.charAt(j))
					{
						c++;
					}
				}
				if(s.charAt(i)!=' ')
				{
					if(c<=min)
					{
						min=c;
						x=i;
					}
				}
			}
		}
		System.out.println("lowest frequncy is "+min+" and its of letter "+s.charAt(x));

	}

}
