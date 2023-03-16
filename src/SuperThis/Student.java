package SuperThis;

public class Student  {
	
	int id;
	String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	public static void main(String[] args) {
		Student st=new Student();
		st.setId(11);
	    System.out.println(st);
		Student st2=new Student();
		st2.setId(21);
		 System.out.println(st2);
		// TODO Auto-generated method stub

	}

}
