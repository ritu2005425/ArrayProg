package MapInterface;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class F4 {

	public static void main(String[] args) {
		//4. WAP to get all the entries from a HashMap. Iterate the entries and print 
	//	the Key & Value.
		
HashMap<Integer,String> map=new HashMap<Integer,String>();
map.put(1, "ritu");
map.put(2, "komal");
map.put(4,"shree");

for(Map.Entry<Integer,String> m:map.entrySet())
{
System.out.println(m.getKey()+ " "+m.getValue());
}

Set s=map.entrySet();
System.out.println(s);
Iterator itr=s.iterator();
while(itr.hasNext())
{
	Map.Entry<Integer,String> de=(Entry<Integer, String>) itr.next();
	if(de.getValue().equals("komal"))
	{
		de.setValue("kajol");
	}
	System.out.println(de.getKey() +" "+de.getValue());
}

}
}