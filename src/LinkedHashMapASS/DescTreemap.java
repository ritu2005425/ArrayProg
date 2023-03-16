package LinkedHashMapASS;

import java.util.Comparator;
import java.util.TreeMap;

public class DescTreemap {
	
public static void main(String[] args) {
		
		TreeMap<Customerss, Orderer> map=new TreeMap<>(new Customerss());
		map.put(new Customerss(5,"see","98509"), new Orderer(5,"bad product"));
		map.put(new Customerss(7,"nobi","87878"), new Orderer(8,"swwet one"));
		map.put(new Customerss(2,"gitu","24421"),  new Orderer(4,"buy now"));
		map.put(new Customerss(1,"ritu","98765421"), new Orderer(2,"good prodicy"));
		System.out.println(map);
}
}
class Customerss implements Comparator<Customerss>
{
	int custid;
	String custName;
	String mobile;
	public Customerss(int custid, String custName, String mobile) {
		super();
		this.custid = custid;
		this.custName = custName;
		this.mobile = mobile;
	}
	public Customerss() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Customerss [custid=" + custid + ", custName=" + custName + ", mobile=" + mobile + "]";
	}
	@Override
	public int compare(Customerss o1, Customerss o2) {
		Integer id=o1.custid;
		Integer id2=o2.custid;
		return -id.compareTo(id2);
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