package sample;

public class Final_Key extends Final_Key2{

	final int a;
	public Final_Key() {
		a=10;
	}
	public void name() {
		System.out.println(a);
	}
	/*public final void method() {
		
	}*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Final_Key s = new Final_Key();
		s.name();
		s.method();
	}

}
