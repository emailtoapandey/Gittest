package CoreJava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class ArrayEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	   int [] rtrn= new int[] {2,3,4,5,7};
	   int target=7;
	  
	    //int [] num=  getTwoSum(rtrn, target);
	   
	  HashMap<String, Integer> map1=new HashMap<>();
	  
	  map1.put("ab", 111);
	  map1.put("bc", 222);
	  map1.put("cd", 333);
	  map1.put("de", 444);
	  System.out.println(map1.get("ab"));
	  
	  
	  
	   
	   
	   ArrayList<String> ar1= new ArrayList<>();
	   
	   ar1.add("ab");
	   ar1.add("bc");
	   ar1.add("cd");
	   ar1.add("de");
	   
	   for(String st1:ar1) {
		   
		   System.out.println(st1);
		   
	   }
	   System.out.println("-----------------------------------------------");
	   
	   Iterator itr= ar1.iterator();
	   while(itr.hasNext()) {
		   
		   System.out.println(itr.next());
	   }
	   
	   
	   
		
		int [] marks= new int [] {22,34,36,47,56};
		
		display(marks);
			

	}
	
	public static void display(int [] marksdisplay) {
		
	for( int i=0; i<marksdisplay.length;i++)
		
		System.out.println("The marks displayed are" + "  " + marksdisplay[i] );
		
	}

}
