package collection.file.io;

import java.util.ArrayList;
import java.util.List;

public class AddingCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> a = new ArrayList<Integer>();
		for(int i = 0; i< 10; i++) {
			a.add(i);
			System.out.println(a);
		}
		a.remove(2);
		a.add(2, 102);
		for(int x : a) {
			System.out.print(x + " ");
		}
	}

}
