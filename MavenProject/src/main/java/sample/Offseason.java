package sample;

public class Offseason extends Onseason{

	public void customer() {
		super.customer(5000);
		int y = (discount)*40/100;
		System.out.println("Discount if customer purchase clothes on Onseason = "+y);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Offseason a = new Offseason();
		a.customer();
	}

}
