package p211026;

import java.util.Arrays;

public class p9 {

	public static void main(String[] args) {
		int [] num = new int[5];
		int sum = 0;
		
		for(int i=0; i<num.length; i++) {
			num[i] = (int)(Math.random()*50) + 1;
		}
		
		System.out.println("[정렬 전]");
		for(int i=0; i<num.length; i++) {
			sum += num[i];
			System.out.printf("num[%d] = %d \t", i, num[i]);
		}
		
		System.out.println();
		Arrays.sort(num); //오름차순 정렬하는 메소드.
		System.out.println("[정렬후]");
		
		for(int i=0; i<num.length; i++) {
			System.out.printf("num[%d] = %d \t", i, num[i]);
		}
		
		System.out.println();
		System.out.printf("\n합 = %d", sum);
	}

}
