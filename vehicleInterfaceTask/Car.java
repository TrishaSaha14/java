package vehicleInterfaceTask;

public class Car extends AbstractVehicle{

	public Car(String name, int speed) {
		super(name, speed);
		
	}

	@Override
	public void start() {
		System.out.println("The Car is starting....");
		
	}

	@Override
	public void stop() {
		System.out.println("The Car has stopped.");
		
	}

	public void displayType() {
		System.out.println("It is a HatchBack car");
	}
	

}
