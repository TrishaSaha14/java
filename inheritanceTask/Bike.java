package inheritanceTask;

public class Bike extends Vehicle{
	private boolean hasgear;
	
	public Bike(String vehicleNumber, String brand, String model, double rentalPricePerDay,boolean isAvailable,boolean hasgear) {
		super(vehicleNumber,brand,model,rentalPricePerDay,isAvailable);
		this.hasgear=hasgear;
	}
	
	public void displayDetails() {
		super.rentVehicle();
		super.displayDetails();
		System.out.println("  "+this.hasgear);
	}
}
