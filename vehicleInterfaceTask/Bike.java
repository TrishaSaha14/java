package vehicleInterfaceTask;

public class Bike extends AbstractVehicle{
	public Bike(String name, int speed) {
		super(name, speed);
		
	}

	@Override
	public void start() {
		System.out.println("The bike is starting....");
		
	}

	@Override
	public void stop() {
		System.out.println("The bike has stopped.");
		
	}
	
	public void displayType() {
		System.out.println("It is a standard bike");
	}
}
