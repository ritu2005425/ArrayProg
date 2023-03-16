package SuperThis;



class Cycleclass {
	
	int accountNo;
	int noOfWheels;
	
	Cycleclass()
	{
		System.out.println("I am default constructor");
	}

	public Cycleclass(int accountNo, int noOfWheels) {
		//this() is used to call current class default constcutor
		this();
		this.accountNo = accountNo;
		this.noOfWheels = noOfWheels;
		System.out.println("inside parameterised");
	}

	
	
}
public class MainOutside
{
	
	MainOutside()
	{
		System.out.println("I am in main method");
	}
	public static void main(String[] args) {
		
		Cycleclass c=new Cycleclass(12,56);
		
	}
	
}