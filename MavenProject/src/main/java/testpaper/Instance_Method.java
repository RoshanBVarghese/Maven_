package testpaper;

public class Instance_Method {

	String name;
	int id;
	String place;
	public void idp(String x, int y, String z) {
		name = x;
		id = y;
		place = z;
		System.out.println("Name "+ name);
		System.out.println("ID "+ id);
		System.out.println("Place "+ z);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Instance_Method obj = new Instance_Method();
		obj.idp("Roshan", 14, "Thycaud");
	}

}
