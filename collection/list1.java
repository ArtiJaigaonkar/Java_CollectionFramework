package collection;
import java.util.*;  //import utility class
public class list1 {
	
	public static void main(String args[]){  
	 //Creating a List  
	 List<String> list=new ArrayList<>();
	 //Adding elements in the List  
	 list.add("Mango");  
	 list.add("Apple");  
	 list.add("Banana");  
	 list.add("Grapes"); 
	 list.add("orange");
	 list.add("Apple");
	 list.add(null);
	 for(String fruits:list)   //use for-each loop
	
	System.out.println(fruits); 
	  
	}  
	}  


