package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Base {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Integer> a1 = new ArrayList <Integer>();
		a1.add(10);
		a1.add(4);
		a1.add(15);
		a1.add(50);
		
		System.out.println(a1);
		a1.remove(2);
		System.out.println(a1);
		System.out.println(a1.size());
		System.out.println(a1.get(1));
		Iterator x =a1.iterator();
		while(x.hasNext()) {
			System.out.println(x.next());
			
		}
	}

}
