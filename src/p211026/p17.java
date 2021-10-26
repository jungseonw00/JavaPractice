package p211026;

public class p17 {

	public static void main(String[] args) {
		p18 st1 = p18.getInstance();
		p18 st2 = p18.getInstance();
		p18 st3 = p18.getInstance();
		st1.str = "시작입니다.";
		System.out.println(st2.str);
		if ( st1 == st2) {
			System.out.println("같다.");			
		} else {
			System.out.println("다르다.");
		}
		
	}

}
