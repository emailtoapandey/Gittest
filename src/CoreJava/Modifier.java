package CoreJava;

public class Modifier {
      protected int z;
	  private int y;
	  public int x;
	  
	  int a;
	 public void display() {
		
		System.out.println("This is a public method");
	}
	 
	 private  void display1() {
		 
		 System.out.println("This is a provate method");
		 
	 }
	 
 protected  void display2() {
		 
		 System.out.println("This is a protected  method");
		 
	 }
	 
 void display3() {
	 
	 System.out.println("This is without any access modifier  method");
	 
 }
	 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Modifier ab=new Modifier();
		
		

	}

}
