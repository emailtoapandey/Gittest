package CoreJava;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numbers=new int[] {2,3,7,4,8};
		//or you can also declare array like int [] numbers={2,3,7,8}0
		
		int target=7;
		int [] result= getTwoSum( numbers,target);
		System.out.println(result[0] +" "+result[1]);

	}

	public static int[] getTwoSum(int [] numbers1, int target1 ) {
		
		  
		
		Map<Integer , Integer>visitNumbers =new HashMap<>();
				
				for ( int i=0; i<numbers1.length; i++) {
					System.out.println(visitNumbers);
					int delta= target1-numbers1[i];
					if (visitNumbers.containsKey(delta)) {
						
						
						
						return new int [] {i,visitNumbers.get(delta) };
					}
					visitNumbers.put(numbers1[i], i);
					
				}
				return new int[] {-1,-1};
		
		
		
		
	}
}
