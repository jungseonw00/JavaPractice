package p211027;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p5 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		br.close();

		for(int i = 0; i <= N; i++) {
			for(int j = 0; j <= N-i; j++) {
				System.out.print(" ");
			}
			for(int k=0; k<i; k++) {
				System.out.print("*");
			}
			System.out.println();
		
	}
}
}
