package stringQuestion;

public class Toggle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="Ritu rRTYamesh jadhav";
char ch2[]=s.toCharArray();
for(int i=ch2.length-1;i>=0;i--)
{
	System.out.print(ch2[i]);
}
//String r=new String(ch2);
//System.out.println("string is="+ r);

char ch[]=new char[s.length()];
for(int i=0;i<s.length();i++)
{
	if(s.charAt(i)>=65 && s.charAt(i)<=90)
	{
		ch[i]=(char) (s.charAt(i)+32);
	}
	else
	{
		ch[i]=(char) (s.charAt(i)-32);
	}
}
String str=new String(ch);
System.out.println(str);
	
String name="rihi jifi ji";
String[] val=name.split(" ");

for(int i=0;i<val.length;i++)
{
	for(int j=val[i].length()-1;j>=0;j--)
		{
	 System.out.print(val[i].charAt(j));
		}
	System.out.println(" ");
	}










	
	}

}
