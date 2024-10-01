package inheritance;

public class Hierar_B extends Hierar_A {

	public void sub() {
		int d = x - y;
		System.out.println(d);
	}
	public static void main(String args[]) {
		Hierar_B x1 = new Hierar_B();
		x1.sum(10,20);
		x1.sub();
	}
}
