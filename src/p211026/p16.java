package p211026;

public class p16 {

		//공통된 객체를 여러 개 생성해서 사용해야 하는 상황에 많이 사용된다.
		//또 메모리 낭비 방지를 할 수 있다는 장점을 가지고 있다.
	public static void main(String[] args) {
		p15 speaker1 = p15.getInstance();
		p15 speaker2 = p15.getInstance();
		
		
		System.out.println(speaker1.getVolume());
		System.out.println(speaker2.getVolume());
			
		speaker1.setVolume(11);
		System.out.println(speaker1.getVolume());
		System.out.println(speaker2.getVolume());
		
		speaker1.setVolume(22);
		System.out.println(speaker1.getVolume());
		System.out.println(speaker2.getVolume());
		
	}

}
