package PracticeAssHashMap;

import java.util.TreeMap;

public class t12 {

	public static void main(String[] args) {
		
		TreeMap<Customer, Order> map=new TreeMap<>();
		map.put(new Customer(5,"see","98509"), new Order(5,"bad product"));
		map.put(new Customer(7,"nobi","87878"), new Order(8,"swwet one"));
		map.put(new Customer(2,"gitu","24421"),  new Order(4,"buy now"));
		map.put(new Customer(1,"ritu","98765421"), new Order(2,"good prodicy"));
		
		System.out.println(map.get(new Customer(5,"see","98509")));
		System.out.println(map);
}
}
class Customer implements Comparable<Customer>
{
	int custid;
	String custName;
	String mobile;
	public Customer(int custid, String custName, String mobile) {
		super();
		this.custid = custid;
		this.custName = custName;
		this.mobile = mobile;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Customer [custid=" + custid + ", custName=" + custName + ", mobile=" + mobile + "]";
	}
	@Override
	public int compareTo(Customer o) {
		// TODO Auto-generated method stub
		if(this.custid>o.custid)
		{
			return +1;
		}
		else if(this.custid<o.custid) {
			return -1;
		}
		else
		{
			return 0;
		}
	
}
}
class Order
{
	int ordered;
	String orderDetails;
	public Order(int ordered, String orderDetails) {
		super();
		this.ordered = ordered;
		this.orderDetails = orderDetails;
	}
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Order [ordered=" + ordered + ", orderDetails=" + orderDetails + "]";
	}
}