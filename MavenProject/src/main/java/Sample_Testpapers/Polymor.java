package Sample_Testpapers;

public class Polymor extends Polymorphism {

	public void data() {
		super.data(14, 15);
		int z = x*y;
		System.out.println(z);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Polymor s = new Polymor();
		s.data();
	}

}
