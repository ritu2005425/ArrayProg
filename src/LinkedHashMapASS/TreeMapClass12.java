package LinkedHashMapASS;

import java.util.TreeMap;

public class TreeMapClass12 {

	public static void main(String[] args) {
//		12.Create Customer class with custid,custName, mobile fields. Create Order 
//		class with ordered,orderDetails fields.
//		Create TreeMap with customer as key and Order as value .it should be sorted 
//		according to custId in ascending order
		TreeMap<Customer,Order>map=new TreeMap<Customer,Order>();
		map.put(new Customer(2,"preeti","98608567"), new Order(24,"good prod"));
		map.put(new Customer(1,"ritu","678865444"), new Order(26,"products grapes"));
		
		System.out.println(map);
		
		
	}

}

class Customer implements Comparable<Customer>
{
	private int custid;
	private String custName;
	private String mobile;
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

	@Override
	public int compareTo(Customer o) {
		//ALLOWED IN BOTH WAYS
//		if(custid==o.custid)
//		{
//			return 0;
//		}
//		else if(custid>o.custid)
//		{
//			return 1;
//		}
//		else
//		{
//			return -1;
//		}
		Integer id=this.custid;
		Integer id2=o.custid;
		return id.compareTo(id2);
		
	}
	
}
class Order 
{
	private int ordered;
	private String orderDetails;
	public Order(int ordered, String orderDetails) {
		super();
		this.ordered = ordered;
		this.orderDetails = orderDetails;
	}
	
	
	@Override
	public String toString() {
		return "Order [ordered=" + ordered + ", orderDetails=" + orderDetails + "]";
	}



	
}