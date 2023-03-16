package MapInterface;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class f5 {

	public static void main(String[] args) {
		// 5. Different ways to iterate over Map?
HashMap<Integer,String> map=new HashMap<Integer,String>();
map.put(1, "ritu");
map.put(2,"uma");
map.put(4, "titu");


//using enhanecd for loop
for(Map.Entry<Integer,String> k:map.entrySet())
{
	System.out.println(k.getKey()+" "+k.getValue());
}

//using Iterator
Set s=map.entrySet();
Iterator  i=s.iterator();
while(i.hasNext())
{
  Map.Entry<Integer,String> df=(Entry<Integer, String>) i.next();
  System.out.println(df.getKey() +" "+df.getValue());
}
System.out.println(" ");
//Using stream api
System.out.println("FOREACH LOOP");
s.forEach(e->{
	System.out.println(e);
});

HashMap<Integer,Integer> mapNumber=new HashMap<Integer,Integer>();
mapNumber.put(1,2);
mapNumber.put(2,4);
mapNumber.put(4,5);
mapNumber.entrySet().stream().map(r->r.getValue() * 2).forEach(t->{System.out.print(t+" ");});


HashMap<Integer,Integer> nummap=new HashMap<Integer,Integer>();
nummap.put(1,2);
nummap.put(2,4);
nummap.put(4,5);
System.out.println("");
nummap.entrySet().stream().map(p->p.getValue() * 2).forEach(tr->{
	System.out.print( tr+" ");
});








}

}
