package CoreJava;

import java.util.ArrayList;
import java.util.ListIterator;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


  
int [] array1 = new int [] {2,4,6,8,9};
ArrayList <Integer> ls= new ArrayList<>();

for (int i=0; i<array1.length; i++) {
	
	System.out.println("the orginal array is "+ array1[i]);
	
	
	
	ls.add(array1[i]);
	
}

System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");

ListIterator <Integer> it= ls.listIterator(ls.size());

while(it.hasPrevious()) {
	
	System.out.println("the reversed array is "+ it.previous() );
	
		
}

	
	}

}
