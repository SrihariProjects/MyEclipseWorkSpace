package mapCollection;

import java.security.KeyStore.Entry;
import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

public class MapPractice {

	public static void main(String[] args) {

		
		List<String> list=new Vector<String>();
		
		//Creation of Map
		Map<Integer, String> m=new Hashtable<Integer, String>();
		m.put(101, "Chennai");
		m.put(103, "Hyd");
		m.put(102, "Delhi");
//		m.put(104, null);
		 
		//Retrieving of keys from the map
		Set<Integer>  keys=m.keySet();
		for(Integer key:keys) {
			System.out.println(key);
			
		}
		

		System.out.println();
		 
		//Retrieving of values from the map
		Collection<String> values=m.values();
		for(String value:values) {
			System.out.println(value);
		}
		
		System.out.println();
		//Retrieving of value from a map using key
		
		System.out.println(m.get(101));
		
		System.out.println();
		for(Integer key:keys) {
			System.out.println(key+">>>"+m.get(key));
		}
		
		System.out.println(m.getOrDefault(1401,"null"));
		
		//deleting
//		m.remove(101);
		System.out.println(m);
		
		System.out.println(m.containsKey(101));
//		System.out.println(m.containsValue(null));
		
	}

}
