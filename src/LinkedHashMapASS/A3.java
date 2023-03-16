package LinkedHashMapASS;

import java.util.LinkedHashMap;

public class A3 {

	public static void main(String[] args) {
		// 3. Create a Linkedhashmap which contains Emp is keys and Emp id is 
		//values.But Map does not contain Same id as key for Emp Object.
		Employee e=new Employee(1,"ritu");
		Employee e1=new Employee(2,"geeta");
		Employee e2=new Employee(4,"tina");
		
		LinkedHashMap<Employee,Integer> map=new LinkedHashMap<Employee,Integer>();
		map.put(e,e.getId());
		map.put(e1,e1.getId());
		map.put(e2, e2.getId());
		System.out.println(map);
		
		System.out.println(e1.getEmpName());
		

	}

}
