import java.util.HashMap;

public class Practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
int [] numbers= new int[] {2,3,5,7,9,11};
		
		int target=11;
		
		int [] ans= getTwoSum(numbers,target);
				
		System.out.println(ans[0]+" "+ans[1]);
		
		

	}

	private static int[] getTwoSum(int[] numbers, int target) {
		
		HashMap<Integer, Integer> map2= new HashMap<>();
		
		for (int i=0; i<numbers.length;i++) {
			
			 map2.put(numbers[i], i);
			 System.out.println(map2);
		  	
		 int res= target-numbers[i]; 	
		 
		 if (map2.containsKey(res)) {
			 
			 
			 
			 return new int [] {map2.get(res),map2.get(numbers[i])};
			 
		 }
		 
		
		
		
		
		}
		return new int [] {-1,-1};		
		
	}

}
