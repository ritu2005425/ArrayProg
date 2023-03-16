package MAP;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeMap;

public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeMap<Customer, Order> map=new TreeMap<>(new Customer());
map.put(new Customer(2,"ru","4878678462"),new Order(2,"flexible"));
map.put(new Customer(1,"ritu","78678462"),new Order(1,"good"));

System.out.println(map);
//Collections.sort(map,new Customer());

	}

}
class Customer implements Comparator<Customer>
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
	@Override
	public String toString() {
		return "Customer [custid=" + custid + ", custName=" + custName + ", mobile=" + mobile + "]";
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public int compare(Customer o1, Customer o2) {
		// TODO Auto-generated method stub
		Integer i=o1.custid;
		Integer i2=o2.custid;
		return -i.compareTo(i2);
	}
	
}

class Order
{
	int ordered;
	String orderDetails ;
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
