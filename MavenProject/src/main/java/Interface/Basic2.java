package Interface;

public class Basic2 implements Basic{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Basic2 s = new Basic2();
		s.method();
		Basic x = new Basic2();
		x.method();
	}

	@Override
	public void method() {
		// TODO Auto-generated method stub
		int c = a+b;
		System.out.println(c);
	}

}
