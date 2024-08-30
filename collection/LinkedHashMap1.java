package collection;
import java.util.LinkedHashMap;

public class LinkedHashMap1 {
	public static void main(String[] args) {
		LinkedHashMap<Integer,String> lkmap=new LinkedHashMap<>();
		lkmap.put(1, "pune");
		lkmap.put(2, "satara");
		lkmap.put(3, "latur");
		
		lkmap.put(4, "mumbai");
		lkmap.put(9, null);
		lkmap.put(null, null);
		lkmap.put(10, null);
		System.out.println("ikd hash map :"+lkmap);
	}

}
