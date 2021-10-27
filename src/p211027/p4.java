package p211027;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p4 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int A, B;
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		for(int i=1; i <= N; i++) {
			st = new StringTokenizer(br.readLine()," ");
			A = Integer.parseInt(st.nextToken());
			B = Integer.parseInt(st.nextToken());
			System.out.println("Case #" + i + ": " + A + " + " + B + " = " + (A+B));
		}
		br.close();
		
	}

}
