package collection;

import java.util.HashMap;
import java.util.Map;

public class map1 {
	public static void main(String[] args) {
		HashMap<Integer,String> map=new HashMap<>();
		map.put(1, "pune");
		map.put(2, "satara");
		map.put(3, "latur");
		map.put(4, "mumbai");
		map.put(null, null);
		map.put(null, null);
		System.out.println(map);
		
//		map method
	//	map.clear();
		System.out.println(map);
		
//		map.remove(2);
//		System.out.println(map);
//		
		for(Map.Entry<Integer, String> entry1 :map.entrySet()) {
			System.out.println("Key :"+entry1.getKey()+" value :"+entry1.getValue());
			
			
		}
		
		
		
	}

}
