package exception_handling;

public class Sample {

	int a;
	public void divide(int b) {
		a = b;
		try {
		int c = b/0;
		System.out.println(c);
		}
		catch (ArithmeticException c) {
			System.out.println(c);
		}
		catch (ArrayIndexOutOfBoundsException c) {
			System.out.println(c);
		}
		catch (ArrayStoreException c) {
			System.out.println(c);
		}
		catch (NullPointerException c) {
			System.out.println(c);
		}
		finally {
			System.out.println("Execeptional Handling");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample s = new Sample();
		s.divide(5);
	}

}
