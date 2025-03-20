package relationalOperator;

public class LogOpe {
	public static void main(String[] args) {
		int num=-10;
		if((num>0)&&(num%2==0)) {
			System.out.println("Positive Even");
		}
		else if((num>0)&&(num%2!=0)) {
			System.out.println("Positive Odd");
		}
		else if((num<0)&&(num%2==0)) {
			System.out.println("Negative Even");
		}
		else if((num<0)&&(num%2!=0)) {
			System.out.println("Negative Odd");
		}
	}

}
