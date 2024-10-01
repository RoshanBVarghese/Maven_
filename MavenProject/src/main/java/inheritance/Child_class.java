package inheritance;

public class Child_class extends Parent_class {

	public void sub() {
		int c = x-y;
		System.out.println(c);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child_class s = new Child_class();
		s.sum(10, 30);
		s.sub();

	}

}
