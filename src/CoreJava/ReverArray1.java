package CoreJava;

public class ReverArray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	  int n=5;
	  
	  fibonacci(n);
	  
	  System.out.println(  fibonacci(n));
	  

	}

	private  static long fibonacci(int n) {
		// TODO Auto-generated method stub
		
		
		if (n<=1) {
			
	   
		return n;
	
		}	
			
		return (fibonacci(n-1)+fibonacci(n-2));
		
	}

}
