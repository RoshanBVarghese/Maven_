package accessmodifier;

public class Acess_Modifier {
	public void sample(){
		System.out.println("public medthod");
	}
	private void sample1() {
		System.out.println("private method");
	}
	protected void sample3() {
		System.out.println("protected method");
	}
	void sample4() {
		System.out.println("default method");
	}
	
	public static void main(String[] args) {
		Acess_Modifier a = new Acess_Modifier();
		a.sample();
		a.sample1();
		a.sample3();
		a.sample4();

	}

}
