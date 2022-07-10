import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;

public class Practise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
int [] numbers= new int[] {2,3,5,7,9};
		
		int target=9;
		
		int [] ans= getTwoSum(numbers,target);
				
		System.out.println(ans[0]+" "+ans[1]);
		
		
		ArrayList <String> ar1= new ArrayList<>();
		ArrayList <String> ar2= new ArrayList<>();
		
		ar1.add("aa");
		ar1.add("bb");
		ar1.add("cc");
		
		System.out.println(ar1);
		System.out.println("------------------");
		for(String st:ar1) {
			
			System.out.println(st);			
		
		}
		System.out.println("----------------------");			
		Iterator <String> it1= ar1.iterator();
		
		while(it1.hasNext()) {
			
			System.out.println(it1.next());
		}
		
		System.out.println("----------------------");	

		ListIterator<String> it2= ar1.listIterator(ar1.size());
		
		while (it2.hasPrevious()) {
			
			System.out.println(it2.previous());
			
		}
		
		System.out.println("----------------------");	
		
		//converting an array to a list
		
	     String [] name= new String[] {"aa","bb","cc","dd"};
	     
	     for(int i=0; i<name.length;i++) {
	    	 
	    	 ar2.add(name[i]);
	    	 
	     }
	     
	     System.out.println(ar2);
	     
	     System.out.println("----------------------");	
	     
	     //Hasmap key value
	     
	     HashMap<String, Integer> map1= new HashMap<>();
	     
	     map1.put("aa", 11);
	     map1.put("bb", 22);
	     map1.put("cc", 33);
	     
	     System.out.println(map1);
	     System.out.println(map1.get("aa"));
	     System.out.println(map1.containsKey("cc"));
		
	}

	
	
	private static int[] getTwoSum(int[] numbers, int target) {
		
		HashMap<Integer, Integer> map2= new HashMap<>();
		
		for (int i=0; i<numbers.length;i++) {
			
			 map2.put(numbers[i], i);
		  	
		 int res= target-numbers[i]; 	
		 
		 if (map2.containsKey(res)) {
			 
			 
			 
			 return new int [] {map2.get(res),map2.get(numbers[i])};
			 
		 }
		 
		
		
		System.out.println(map2);
		
		}
		return new int [] {-1,-1};		
		
	}

}
	

