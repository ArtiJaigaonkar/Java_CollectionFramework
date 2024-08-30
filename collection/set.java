package collection;

import java.util.Set;
import java.util.*;

public class set {
	public static void main(String[]args) {
		Set<String> Set = new HashSet<>(); 
		
		Set.add("Arti");
		Set.add("Aditi");
		Set.add("Aboli");
		Set.add("sonu");
		System.out.println(Set);
		
		Set.clear();
		System.out.println(Set);
		
		SortedSet<String>ss=new TreeSet<>();
		ss.add("ABC");
		ss.add("PQR");
		ss.add("XYZ");
		System.out.println(ss);
//		ss.add(null);
//		System.out.println("Tree Set:"+ss);
		 
		System.out.println(ss.tailSet("PQR"));
//      Tailset other method
//		System.out.println(ss.first());
//		System.out.println(ss.last());
		
		
		System.out.println(Set);
		int count =Set.size();
		
		for(String s2:Set) {
			System.out.println(s2);
		}
	}
}
		
		
		
		
		  



