package variablesAndDatatypes;
import java.util.Scanner;
//import methods.Methods;

public class AccessVariables {
	public static void main(String[] args) {
		 //System.out.println(Variables.a);
		//Methods.message();
		//System.out.println(Math.ceilMod(8, 9));
		absolute(subtract(10,20));
	}
	public static void absolute(int x) {
		System.out.println(Math.abs(x));
	}
	public static int subtract(int x, int y) {
		return Math.subtractExact(x, y);
	}

}
