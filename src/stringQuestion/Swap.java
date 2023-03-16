package stringQuestion;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="ritu";
		String s2="revuli";
		String s4=s+s2;
	//	riturevuli
		String a=s4.substring(s.length());
		String b=s4.substring(0,s4.length()-1-s.length()-1);
		System.out.println(a);
		System.out.println(b);
		
		

	}

}
