package InterviewASS;

public class OccurentCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="ritu rrr";
		//whenever you want to apply stream on stings use chars()
		long t=s.chars().filter(e->(char)e=='r').count();
		System.out.println(t);
		long n=s.chars().filter(e->e=='r').count();
		System.out.println(n);
	}

}
