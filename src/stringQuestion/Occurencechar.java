
package stringQuestion;

public class Occurencechar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="whhhhat a good name";

for(int i=0;i<s.length();i++)
{
	boolean flag=true;
	for(int j=i-1;j>=0;j--)
	{
		if(s.charAt(i)==s.charAt(j))
		{
			flag=false;
		}
	}
	if(flag)
	{
		int c=1;
		for(int k=i+1;k<s.length();k++)
		{
			if(s.charAt(i)==s.charAt(k))
			{
				c++;
			}
		}
		if(s.charAt(i)!=' ')
		{
			System.out.println(s.charAt(i)+" "+c);
		}
		
		
	}
	
}
	}

}
