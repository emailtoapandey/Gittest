package CoreJava;

public class Apone {
	
	private int x=10;
	
	private void Dis(int x ) {
		
		this.x=x;
		
		System.out.println(x);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Apone obj=new Apone();
		Apone obj1=new Apone();
	    int y=obj.x;
	    obj.Dis(7);
	    
	    
	    System.out.println(obj.x+obj1.x);
		

	}

}
