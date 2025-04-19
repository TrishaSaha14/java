package lambdaExpressions;

public class Lambdadriver {
	public static void main(String[] args) {
		LambdaDemo l1 = () -> System.out.println("Hello"); // since no parameters in the method of the interface so the
															// parameter remains empty
		l1.print();

		Demo2 l2 = () -> System.out.println("Hello"); 
		l2.greet();
	}
}
