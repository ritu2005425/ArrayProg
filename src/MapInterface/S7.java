package MapInterface;


import java.util.Collections;
import java.util.HashMap;

public class S7 {

	public static void main(String[] args) {
		//7. WAP to get only the Values from a HashMap.
		HashMap<Integer,Integer> mapNumber=new HashMap<Integer,Integer>();
		mapNumber.put(1,2);
		mapNumber.put(2,4);
		mapNumber.put(4,5);
		
		
	
		
		mapNumber.entrySet().stream().forEach(e->{
			System.out.println(e.getValue());
		});
		
	}

}
