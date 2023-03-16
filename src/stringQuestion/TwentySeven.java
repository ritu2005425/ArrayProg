package stringQuestion;

public class TwentySeven {

	public static void main(String[] args) {
		// 27.	Write a Java program to find highest frequency character in a string.
		
		String st="helllo guys I am at pune";
		int max=1;
		int x=0;
		for(int i=0;i<st.length();i++)
		{
			
			boolean flag=true;
			for(int k=i-1;k>=0;k--)
			{
				if(st.charAt(k)==st.charAt(i))
				{
					flag=false;
				}
			}
			if(flag)
			{
				int c=1;
				for(int j=i+1;j<st.length();j++)
				{
					if(st.charAt(i)==st.charAt(j))
					{
						c++;
					}
				}
				if(st.charAt(i)!=' ')
				{
					if(c>max)
					{
						max=c;
						x=i;
					}
				//System.out.println(c);
				}
			}
		}
	System.out.println(max+" Highesh frequency charcter "+st.charAt(x));
 
	}

}
