package LinkedHashMapASS;

import java.util.HashMap;
import java.util.Map;

public class t4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Empployee, Integer> map=new HashMap<Empployee, Integer>();
		map.put(new Empployee(1,"ritu",21), 1);
		map.put(new Empployee(2,"hema",22), 2);
		map.put(new Empployee(4,"sweta",25),5);	
//		for(Map.Entry<Empployee, Integer> m:map.entrySet())
//		{
//			System.out.println(m.getKey()+" "+m.getValue());
//		}
		HashMap<HashMap<Empployee, Integer>, Integer> map2=new HashMap<HashMap<Empployee, Integer>, Integer>();
		map2.put(map, 1);
		System.out.println(map2);
		
	}

}
class Empployee
{
	int id;
	String name;
	int age;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public Empployee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Empployee(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
}