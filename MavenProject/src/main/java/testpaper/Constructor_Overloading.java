package testpaper;

public class Constructor_Overloading {

	public Constructor_Overloading(int a, int b) {
		System.out.println(a+b);
	}
	public Constructor_Overloading(int a) {
		System.out.println(a*a);
	}
	public Constructor_Overloading(String c) {
		System.out.println(c);
	}
	
	public Constructor_Overloading() {
		// TODO Auto-generated constructor stub
		System.out.println("Invalid");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor_Overloading x = new Constructor_Overloading(10,20);
		Constructor_Overloading y = new Constructor_Overloading(10);
		Constructor_Overloading z = new Constructor_Overloading("Roshan");
		Constructor_Overloading v = new Constructor_Overloading();
	}

}
