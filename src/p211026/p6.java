package p211026;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p6 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		String a;
		int b, c;
		System.out.println("품명 : "); a = br.readLine();
		System.out.println("수량 : "); b = Integer.parseInt(br.readLine());
		System.out.println("단가 : "); c = Integer.parseInt(br.readLine());
		compute(a, b, c);
	}
	
	public static void compute(String item, int qty, int price) {
		System.out.println("품명 : " + item);
		System.out.println("금액 : " + (qty * price));
	}

}
