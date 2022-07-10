package CoreJava;

public class UKTrafficLight implements TrafficRules{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UKTrafficLight a= new UKTrafficLight();
		
		a.redLight();
		a.yellowLight();
		a.greenLight();

	}

	@Override
	public void redLight() {
		// TODO Auto-generated method stub
		System.out.println(" This is UK red light");
	}

	@Override
	public void greenLight() {
		// TODO Auto-generated method stub
		System.out.println(" This is UK green light");
	}

	@Override
	public void yellowLight() {
		// TODO Auto-generated method stub
		System.out.println(" This is UK yellow light");
	}

}
