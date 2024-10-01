package testpaper;

public class Static_Method {

	static int x;
	static int y;
	public static int sum() {
		x = 10;
		y = 20;
		int z = x+y;
		//System.out.println(z);
		return z;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Static_Method a = new Static_Method();
		//a.sum();
		System.out.println(a.sum());
	}

}
