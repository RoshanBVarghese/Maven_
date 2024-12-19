package exception_handling;

public class Condition {
	int a;
	public void check(int b) {
		a = b;
		if(a>=18) {
			System.out.println("Eligible");
		}
		else {
			throw new ArithmeticException ("Sorry not eligible");
			//System.out.println("Not Eligible");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Condition x = new Condition();
		x.check(10);

	}

}
