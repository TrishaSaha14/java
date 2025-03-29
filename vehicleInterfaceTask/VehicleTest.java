package vehicleInterfaceTask;

public class VehicleTest {
	public static void main(String[] args) {
		AbstractVehicle car = new Car("Desire",150);
		AbstractVehicle bike = new Bike("Apache",80);
		AbstractVehicle truck = new Truck("Goods&Services",150);
		
		car.start();
		car.displayDetails();
		car.accelerate(30);
		car.displayDetails();
		car.brake(20);
		car.stop();
		car.displayType();
		System.out.println("..........................................");
		bike.start();
		bike.brake(20);
		bike.displayDetails();
		bike.stop();
		bike.displayType();
		System.out.println("..........................................");
		truck.start();
		truck.accelerate(50);
		truck.getCurrentSpeed();
		truck.displayDetails();
		truck.stop();
		truck.displayType();
	}
}
