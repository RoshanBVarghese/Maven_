package inheritance;

public class Sample_C extends Sample_B{

	public void mul() {
		int s = a*b;
		System.out.println(s);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sample_C ans = new Sample_C();
		ans.sum(30, 20);
		ans.sub();
		ans.mul();
	}

}
