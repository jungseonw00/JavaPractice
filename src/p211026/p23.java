package p211026;

import java.util.ArrayList;

public class p23 {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(6);
		for (int i=0; i< al.size(); i++) {
			System.out.println(al.get(i));
		}
		System.out.println("====================");
		for (int integer : al) {
			System.out.println(integer);
		}
	}

}
