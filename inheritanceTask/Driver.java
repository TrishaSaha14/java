package inheritanceTask;

public class Driver {
	public static void main(String[] args) {
		Bike bike = new Bike("12100","YAMAHA","A255",400.00,true,true);
		Car car = new Car("12200","KIA","K676",1500.00,false,5);
		bike.displayDetails();
		car.displayDetails();
	}
}
