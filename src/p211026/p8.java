package p211026;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p8 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		int [] month= {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		int a;
		
		System.out.println("원하는 달 : "); a = Integer.parseInt(br.readLine());
		//원하는 월을 쓸경우 달을 month의 index에 넣어서 -1을 한다.
		System.out.printf("%d월은 %d일 입니다...", a, month[a-1]);
	}

}
