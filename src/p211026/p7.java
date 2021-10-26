package p211026;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p7 {

	public static void main(String[] args) throws IOException {
		//배열로 입력 값 3개 받기.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String [] name = new String[3];
		int    [] age  = new int [3];
		for (int i=0; i<age.length; i++) {
			//br.readLine()은 기본 String형식이나 int형식을 사용할려면 Integer.parseInt를 사용해야 함.
			System.out.println("이름 : "); name[i] = br.readLine();
			System.out.println("나이 : "); age[i] = Integer.parseInt(br.readLine());
		}
		for (int i=0; i<age.length; i++) {
			System.out.println(name[i] + "\t" + age[i] + "세");
		}
	}
}
