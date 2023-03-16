package LinkedHashMapASS;

 import java.util.TreeMap;

public class tree13 {

	public static void main(String[] args) {
//		13. Add TreeMap created in Q12 in other TreeMap which should be sorted by 
//		custID in descending orderrer>();
		TreeMap<Customers,Orders>map=new TreeMap<Customers,Orders>();
		map.put(new Customers(1,"yami","76725"), new Orders(12,"hello"));
		map.put(new Customers(2,"yashu","768927"), new Orders(11,"shapoo"));
		map.put(new Customers(5,"oom","254176"), new Orders(18,"good"));
		System.out.println(map);
		}
}

 
class Customers implements Comparable<Customers>
{
	private int custid;
	private String custName;
	private String mobile;
	public Customers(int custid, String custName, String mobile) {
		super();
		this.custid = custid;
		this.custName = custName;
		this.mobile = mobile;
	}
	
	
	@Override
	public String toString() {
		return "Customers [custid=" + custid + ", custName=" + custName + ", mobile=" + mobile + "]";
	}


	@Override
	public int compareTo(Customers o) {
		if(custid==o.custid)
		{
			return 0;
		}
		else if(custid>o.custid)
		{
			return -1;
		}
		else
		{
			return 1;
		}
	}
	
}

class Orders
{
	
	private int ordered;
	private String orderDetails;
	public Orders(int ordered, String orderDetails) {
		super();
		this.ordered = ordered;
		this.orderDetails = orderDetails;
	}
	@Override
	public String toString() {
		return "Orders [ordered=" + ordered + ", orderDetails=" + orderDetails + "]";
	}
	
	
}