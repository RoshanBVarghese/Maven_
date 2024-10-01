package Encapsulation;

public class Sample1 {

	private int x;
	private int pin[] = {1001,1234,1212};
	public void setter(int a) {
		this.x=a;
		
	}
	public void getter() {
		if (x==pin[0]) {
			System.out.println("Pin successful "+x );
		}
		else if (x==pin[1]){
			System.out.println("Pin successful "+x);
		}
		else if (x==pin[2]) {
			System.out.println("Pin successful "+x );
		}
		else {
			System.out.println("Invalid");
		}
	}
}
