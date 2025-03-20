package relationalOperator;

public class RelOpe {
	public static void main(String[] args) {
		System.out.println(true==true);
		String s1 ="Hello";
		String s2 = "Hello";
		System.out.println(s1==s2);
		//int a=10, b=20, c=5;
		//System.out.println((a>b)&&(a>c)?a:((b>a)&&(b>c)?b:c));
		int a = 2;
		int b = 5;
		int res = a++ - --a - a-- + b-- + ++b + ++a - ++b + b--;
		System.out.println(res);
		byte x = 10;
		x += 10;
		System.out.println(x);
		byte y = (byte) 128;
		System.out.println(y);
		
		byte e = 10;
		short f = e;
		System.out.println(f);
		short g = 20;
		byte h =(byte) g;
		System.out.println(g);
		int i = 30;
		char j =(char) i;
		System.out.println(j);
		long k = 40;
		float l = k;
		System.out.println(l);
		float m = 50.0f;
		double n = m;
		System.out.println(n);
		//double o = 60.0d;
		char o = 'A';
		int p = o;
     	System.out.println(p);
     	System.out.println(5/0.0);
	}
}
