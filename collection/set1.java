package collection;
import java.util.*; 
public class set1 {
	
	public static void main(String[] args) 
		{ 
			// Demonstrating Set using HashSet 
			// Declaring object of type String 
			Set<String> hs = new HashSet<String>(); 

			// Adding elements to the Set 
			// using add() method 
			hs.add("Geeks"); 
			hs.add("For"); 
		    hs.add("Example"); 
			hs.add("Set");
			hs.add(null);
			//hs.add(null);
//			hs.add("Set");
			

			// Printing elements of HashSet object 
			System.out.println(hs); 
			
		} 
	}



