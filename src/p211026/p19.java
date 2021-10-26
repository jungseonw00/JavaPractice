package p211026;

public class p19 {

	public static void main(String[] args) {
		String[] str = {"산토끼", "고양이", "진도개", "치와와"};
		for (int i=0; i<str.length; i++) {
			System.out.println(str[i]);
		}
		//둘다 똑같이 배열을 출력하지만 아래가 더 깔끔하다.
		System.out.println("==== == ====");
		for (String kkk : str) {
			System.out.println(kkk);
		}
	}

}
