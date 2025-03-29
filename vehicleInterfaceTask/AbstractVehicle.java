package vehicleInterfaceTask;

public abstract class AbstractVehicle implements Vehicle{
	
	protected String name;
	protected int speed;
	
	public AbstractVehicle(String name,int speed){
		this.name=name;
		this.speed=speed;
	}
	
	
	
	public void accelerate(int increment) {
		speed += increment;
		System.out.println("Speed is accelerating...");
	}
	
	public void brake(int decrement) {
		speed -= decrement;
		System.out.println("The speed is decrementing...");
	}
	
	public int getCurrentSpeed() {
		return this.speed;
	}
	
	public void displayDetails() {
		System.out.println("Name of the vehicle :"+this.name+"\nspeed of the vehicle: "+this.speed);
		System.out.println();
	}

}
