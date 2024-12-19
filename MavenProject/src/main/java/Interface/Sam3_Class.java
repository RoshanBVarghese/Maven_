package Interface;

public class Sam3_Class implements Sam,Sam2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sam3_Class x = new Sam3_Class();
		x.mr();
		x.rm();
	}

	@Override
	public void rm() {
		// TODO Auto-generated method stub
		int x = a+b;
		System.out.println(x);
	}

	@Override
	public void mr() {
		// TODO Auto-generated method stub
		int y = c-d;
		System.out.println(y);
	}

}
