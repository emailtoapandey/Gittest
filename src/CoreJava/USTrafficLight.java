package CoreJava;

public class USTrafficLight implements TrafficRules{

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		USTrafficLight b= new USTrafficLight();
		
		b.yellowLight();
		b.redLight();
		b.greenLight();

	}

	@Override
	public void redLight() {
		// TODO Auto-generated method stub
		System.out.println("this is US red light");
	}

	@Override
	public void greenLight() {
		// TODO Auto-generated method stub
		System.out.println("this is US green light");
	}

	@Override
	public void yellowLight() {
		// TODO Auto-generated method stub
		System.out.println("this is US yellow light");
	}

}
