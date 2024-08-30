package collection;

import java.util.ArrayList;

public class ArrayList1 {
	public static void main(String[] args) {    
		ArrayList<Student> list=new ArrayList<>();
		Student obj=new Student(101,"Arti","pune",90);
		Student obj1=new Student(102,"Aditi","Latur",80);
		Student obj2=new Student(103,"Aboli","murud",70);
		
				
		list.add(obj);
		list.add(obj1);
		list.add(obj2);
		
		System.out.println(list);
	}
}

//   ArrayList list=new ArrayList();
//		
//		list.add(10);
//		list.add(10);                           
//		list.add(4);
//		list.add(5);
//		list.add(67);
//		list.add(null);
//		list.add(null);
//		System.out.println(list);
//		
		                                                        

//method of ArrayList

//it is non sync
//index based data structure
//follow insertion order
//not following sorting sequence
//allow duplicate value and null value