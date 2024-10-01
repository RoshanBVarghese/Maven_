package aggregation;

public class Basic2 {
Basic z;
	int a,b;
	public Basic2(int c, int d,Basic z) {
		this.a=c;
		this.b=d;
		this.z=z;
	}
	public void method() {
		System.out.println(z.x);
		System.out.println(z.y);
		System.out.println(a);
		System.out.println(b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Basic s = new Basic(10,20);
		Basic2 s1 = new Basic2(10,5,s);
		s1.method();
	}

}
