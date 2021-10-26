package p211026;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p4 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int x, y, answer = 1;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("x의 값을 입력하시오 : "); 
		x = Integer.parseInt(br.readLine()); 
		System.out.println("y의 값을 입력하시오 : "); 
		y = Integer.parseInt(br.readLine());
		for (int i = 1; i <= y; i++) {
			answer *= x;
		}
		System.out.printf("%d의 %d승 은 %d",x, y, answer);
	}

}
