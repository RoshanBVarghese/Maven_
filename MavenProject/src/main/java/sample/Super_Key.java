package sample;

public class Super_Key {

	int a;
	int b;
	public Super_Key(int x,int y) {
		a = x;
		b = y;
		System.out.println(a);
		System.out.println(b);
	}
	public void method(int x, int y) {
		a = x;
		b = y;
		int z = a+b;
		System.out.println(z);
	}

}
