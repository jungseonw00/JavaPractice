package p211026;

public class p5 {

	public static void main(String[] args) {
		output(10, "#");
	}

	public static void output (int a, String b) {
		// 1. return이 없어서 void 를 사용했음.
		// 2. 파라미터로 a, b를 받았음.
		for(int i=1; i<=a; i++) {
			System.out.print(b + " ");
		}
	}
}
