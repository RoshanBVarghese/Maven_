package Sample_Selenium;

public class Sample4 {

	public static void ovr(int x,int y) {
		int z = x - y;
		System.out.println(z);
	}
	public static void ovr(int x) {
		System.out.println(x);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample4.ovr(50, 10);
		Sample4.ovr(50);
	}

}
