package Sample_Testpapers;

public abstract class Abstra {
	public abstract void print();
	int x;
	String y;
	public Abstra() {
		String a = "Roshan";
		System.out.println(a);
	}
	public void sum(int a,String b) {
		x = a;
		y = b;
		String c = x+y;
		System.out.println(c);
	}
}
