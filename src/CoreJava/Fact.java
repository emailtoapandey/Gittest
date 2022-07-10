package CoreJava;

public class Fact {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Fact f=new Fact();
	System.out.println(f.getFact(4));
		
	int Fact =  getFact(5);
	
	System.out.println(Fact);
	
  int res1= getFact1(5);	
  
  System.out.println(res1);
	
	
	
}

	public  static int getFact(int fact) {
		// TODO Auto-generated method stub
		
		for(int i=fact-1; i>=1; i--) {
			
			fact=fact*i;
			
		}
		
		
		return fact;
	}
	
	public static int getFact1(int n) {
					
			if(n==1) {
				
				return 1;
				
			}
		
		return n*getFact1(n-1);
			
		
		
		
	}
	
	
	
}
