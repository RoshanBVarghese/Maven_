package abstraction;

public class Abstraction2 extends Abstract{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abstraction2 a = new Abstraction2();
		a.display();
		a.method(5, 40);
		a.stat("Yamaha R ", 15);
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		int a =10;
		int b =4;
		int c = a+b;
		System.out.println("Hello " +c);
	}

}
