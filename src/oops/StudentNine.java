package oops;


//two refernces pointing to the same object then hashcode is same
public class StudentNine {

	int id;
	public static void main(String[] args) {
		
		StudentNine st=new StudentNine();
		StudentNine st2=st;
		System.out.println(st);
		System.out.println(st2);
	}

}
