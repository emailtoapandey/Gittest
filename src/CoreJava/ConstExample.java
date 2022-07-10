package CoreJava;

public class ConstExample {
	
	String name;
	String city;
	int age;
	
	public ConstExample(String name, String city, int age) {
		
	  this.name=name;
	 this.city=city;
	 this.age=age;
		System.out.println(name+" "+city+" "+ age);
		                 
		System.out.println(this.name);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstExample obj= new ConstExample("Alok", "Varanasi", 25);
		ConstExample obj1= new ConstExample("Alok1", "Lohta", 25);
	     
		   
		
	}

}
