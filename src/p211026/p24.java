package p211026;

import java.util.ArrayList;

public class p24 {

	public static void print(ArrayList<String> list) {
		for (String str : list) {
			System.out.println(str + "\t");
		}
		System.out.println("\n------------------------------------");
	}
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("수박");
		list.add("사과");
		list.add("바나나");
		list.add("수박");
		list.add("대추");
		list.add("바나나");
		System.out.println("갯수 : " + list.size());
		print(list);
	}

}
