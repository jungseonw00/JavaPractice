package p211027;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class p2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		for (int i = N; i > 0; --i) {
			bw.write(i +"\n");
		}
//		while (N > 0) {
//			System.out.println(N);
//			N--;
//		}
		br.close();
		bw.flush();
		bw.close();
	}

}
