package day7Java;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Maps {


	//Map is a collection of key and value pair
	//Keys can't be duplicate
	//Values can be duplicate
	public static void main(String[] args) {
		
		Map<String,Integer> students=new HashMap<String, Integer>();
		
		//for synchronization use table
		Map<String,Integer> students1=new Hashtable<String, Integer>();
		
		students.put("Srihari", 99);
		students.put("Geetha", 92);
		students.put("ghos", 95);
		students.put("Kavya", 93);
		
		System.out.println(students.get("Srihari"));
		System.out.println(students);
		
		students.put("Geetha", 93); //Keys are unique if you mention it will update the values
		
		//only fetch Keys method
		System.out.println(students.keySet());
		
		//using for loop
			for(String key:students.keySet()) {
				System.out.println(key);
			}
	}

}
