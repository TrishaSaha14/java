package vehicleInterfaceTask;

public class Truck extends AbstractVehicle {
	public Truck(String name, int speed) {
		super(name, speed);
		
	}

	@Override
	public void start() {
		System.out.println("The truck is starting....");
		
	}

	@Override
	public void stop() {
		System.out.println("The truck has stopped.");
		
	}
	
	public void displayType() {
		System.out.println("It is a box truck");
	}
}
