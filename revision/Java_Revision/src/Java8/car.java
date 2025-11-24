package Java8;

public class car implements vehicle{

	@Override
	public void start() {
		System.out.println("Hello start");
	}
	
	public static void main(String[] args) {
		
		car car = new car();
		car.start();
		car.clean();
		vehicle.myClean();
		
	}

}
