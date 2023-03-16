package stringQuestion;

public class Twelve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//11.	12.	Write a Java program to count occurrences of a character in given string.
		String s="riturrejj jadahav";
		
		for(int i=0;i<s.length();i++)
		{    
			boolean flag=true;
			for(int k=i-1;k>=0;k--)
			{
				if(s.charAt(i)==s.charAt(k))
				{
					flag=false;
				}
			}
			
			if(flag)
			{
				int c=1 ;
				for(int j=i+1;j<s.length();j++)
				{
					if(s.charAt(i) == s.charAt(j))
					{
						c++;
					}
				}
				if(s.charAt(i)!=' ')
				{
				System.out.println(s.charAt(i)+" occured "+c);
				}
			}
			
		}

	}

}
