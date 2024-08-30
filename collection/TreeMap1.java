package collection;
import java.util.*;

	public class TreeMap1 {
		public static void main(String[] args) {
			TreeMap<Integer, String> treemap=new TreeMap();
		
			treemap.put(1, "pune");
			treemap.put(3, "latur");
			treemap.put(2, "satara");
			treemap.put(4, "mumbai");
//			treemap.put(null, null);
			treemap.put(10, null);
			treemap.put(9, null);
			System.out.println("tree map map is :"+treemap);
			
		}

	}



