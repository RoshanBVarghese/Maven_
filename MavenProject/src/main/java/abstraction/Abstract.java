package abstraction;

public abstract class Abstract {
	public abstract void display();
	int x,y;
	static String a;
	static int b;
	public Abstract() {
		String a = "Roshan";
		System.out.println(a);
	}
	public void method(int a,int b) {
		x =a;
		y = b;
		int z = x+y;
		System.out.println(z);
	}
	public static void stat(String x,int y) {
		a =x;
		b =y;
		String c = a+b;
		System.out.println(c);
	}
}
