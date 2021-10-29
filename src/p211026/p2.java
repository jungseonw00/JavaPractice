package p211026;

//구구단
public class p2 {
	
	public static void main(String[] args) {
		for(int i=1; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				System.out.println(i + "*" + j + "=" + i*j);
			}
			System.out.println(i + "단 입니다.");
		}
	}

}
