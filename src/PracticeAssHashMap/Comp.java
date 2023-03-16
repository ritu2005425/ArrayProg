package PracticeAssHashMap;

import java.util.Comparator;
import java.util.TreeMap;

public class Comp {

	public static void main(String[] args) {
		TreeMap<Customers, Orderer> map=new TreeMap<Customers, Orderer>();
		map.put(new Customers(5,"see","98509"), new Orderer(5,"bad product"));
		map.put(new Customers(7,"nobi","87878"), new Orderer(8,"swwet one"));
		map.put(new Customers(2,"gitu","24421"),  new Orderer(4,"buy now"));
		map.put(new Customers(1,"ritu","98765421"), new Orderer(2,"good prodicy"));
		System.out.println(map);
}
}
class Customers implements Comparator<Customers>
{
	int custid;
	String custName;
	String mobile;
	public Customers(int custid, String custName, String mobile) {
		super();
		this.custid = custid;
		this.custName = custName;
		this.mobile = mobile;
	}
	public Customers() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Customers [custid=" + custid + ", custName=" + custName + ", mobile=" + mobile + "]";
	}
	@Override
	public int compare(Customers o1, Customers o2) {
		// TODO Auto-generated method stub
		Integer id=o1.custid;
		Integer id2=o2.custid;
		return id.compareTo(id2);
	}	
}

class Orderer
{
	int Orderered;
	String OrdererDetails;
	public Orderer(int Orderered, String OrdererDetails) {
		super();
		this.Orderered = Orderered;
		this.OrdererDetails = OrdererDetails;
	}
	public Orderer() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Orderer [Orderered=" + Orderered + ", OrdererDetails=" + OrdererDetails + "]";
	}
}