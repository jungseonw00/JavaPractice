package p211026;

import java.util.*;

public class Main {
	public static void main(String args[]){
		//1부터 입력받은 값까지 합 구하기
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int sum = 0;
		for (int i=1; i<=n; i++) {
			sum += i;
		}
		System.out.println(sum);
	}
}
