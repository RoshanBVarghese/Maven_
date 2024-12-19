package Interface;

public class Inter2 implements Inter,Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inter2 a = new Inter2();
		a.method();
		a.print();
	}

	@Override
	public void method() {
		// TODO Auto-generated method stub
		int a = 5;
		int b = 9;
		int c = a+b;
		System.out.println(c);
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("I hope ");
	}

}
