package inheritance;

public class Hierar_C extends Hierar_A{

	public void mul() {
		int e = x*y;
		System.out.println(e);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hierar_C x = new Hierar_C();
		x.sum(10,20);
		x.mul();
	}

}
