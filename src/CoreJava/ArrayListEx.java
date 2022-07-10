package CoreJava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;



public class ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				
		ArrayList <String> list =new ArrayList<>();
		
		list.add("alok");
		list.add("rajesh");
		list.add("amar");
		list.add("yadvendra");
		list.add("amar");
	
		System.out.println(list);
		System.out.println(list.get(0));
		String str1=list.get(1);
		System.out.println(str1);
		
		System.out.println(list.contains("amar"));
		System.out.println(("--------------------------------------------------------"));
		
		
		for( String str2:list) {
			
			System.out.println(str2);
					
				
		
		}
		System.out.println(("--------------------------------------------------------"));

		 Iterator<String> itr=list.iterator();
		 while(itr.hasNext()){
			 
		
			 System.out.println(itr.next());
			 
			 
		 }
		 
		 System.out.println(("--------------------------------------------------------"));
		 
		 ListIterator <String> sr5= list.listIterator(list.size());
		 while(sr5.hasPrevious()) {
			 
			 System.out.println(sr5.previous());
		 }
		 
		 System.out.println(("--------------------------------------------------------"));
		 
			
	     HashMap<String, Integer> ls =new HashMap<>();
	     
	     ls.put("Alok",22);
	     ls.put("aamar", 33);
	     ls.put("rajesh", 45);
	     ls.put("Yadvendra",55);
	     
	     System.out.println(ls.get("Alok"));
	    
		
	
	}
}
	


