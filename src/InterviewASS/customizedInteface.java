package InterviewASS;


interface Readable
{
//	public abstract void m1();
	
//	public abstract int m2(int a,int b);
	public abstract boolean m4(boolean b);
}
public class customizedInteface {

	public static void main(String[] args) {
		
//		Readable r=()->System.out.println("good to se you");
//		r.m1();
		
//	Readable r2=(int a,int b)->( a+b);
//	System.out.println(r2.m2(4, 5));
		
		Readable r4=(boolean b)-> b;
			
		
		System.out.println(r4.m4(false));
	}

}
