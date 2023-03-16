package MapInterface;

import java.util.Collection;
import java.util.HashMap;

public class Try {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,Character> mapNumber=new HashMap<Integer,Character>();
		mapNumber.put(1,'a');
		mapNumber.put(2,'b');
		mapNumber.put(4,'c');
		mapNumber.put(5,'a');
		mapNumber.put(6,'f');
		
	Character[] ch=	mapNumber.values().toArray(new Character[0]);
	for(int i=0;i<ch.length;i++)
	{
		System.out.println(ch[i]);
	}
		//System.out.println(c);
	}

}
