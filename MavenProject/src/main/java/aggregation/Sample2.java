package aggregation;

public class Sample2 {
	Sample1 c;
	String z;
	public Sample2(String x, Sample1 c) {
		this.z=x;
		this.c=c;
	}
	public void details() {
		System.out.println("Name "+c.x);
		System.out.println("Roll No "+c.y);
		System.out.println("Address "+z);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample1 s = new Sample1("Roshan",14);
		Sample2 s1 = new Sample2("Thycaud",s);
		s1.details();
	}

}
