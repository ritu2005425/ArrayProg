package ArrayListReadOnly;
import java.util.stream.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class ShufffleArraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList<String> array_list = new ArrayList<String>();//creating an arraylist of strings
	     
	     array_list.add("Monday");
	     array_list.add("Tuesday");
	     array_list.add("Wednesday");
	     array_list.add("Thursday");
	     array_list.add("Friday");
	     array_list.add("Saturday");
	     array_list.add("Sunday");
	     
	   
	     Collections.shuffle(array_list);
	     System.out.println(array_list);
	     
	     
	     TreeSet<String> tree_set = new TreeSet<String>();//creating an empty tree set
	     //adding values in the tree set
	     tree_set.add("Monday");
	     tree_set.add("Tuesday");
	     tree_set.add("Wednesday");
	     tree_set.add("Thursday");
	     tree_set.add("Friday");
	     tree_set.add("Saturday");
	     tree_set.add("Sunday");
	   //  TreeSet<String> tree_set2 = new TreeSet<String>(tree_set);
	     TreeSet<String> tree_set2 =(TreeSet<String>) tree_set.clone();
	     System.out.println(tree_set2);
	}

}
