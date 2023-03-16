package stringQuestion;

public class t32 {

	public static void main(String[] args) {
		// 32.	Write a Java program to remove all repeated characters from a given string.
	  String s="riturjadhav";
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
				  if(c==1)
				  {
					  System.out.print(s.charAt(i));
				  }
				  
			  }
		  }
	  }
	 
	}

}
