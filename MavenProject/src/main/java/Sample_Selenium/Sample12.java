package Sample_Selenium;

public class Sample12 extends Sample11{
	public void display2() {
		System.out.println("Child");
	}
	public static void main(String[] args) {
		Sample12 x = new Sample12();
		x.display();
		x.display2();
	}
}
