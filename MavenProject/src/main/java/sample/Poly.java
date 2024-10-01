package sample;

public class Poly extends Polymorphism{

	public void sum() {
		super.sum(10, 30);
		int c = x-y;
		System.out.println(c);
		//super.Sum(10, 30);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Poly a = new Poly();
		a.sum();

	}

}
