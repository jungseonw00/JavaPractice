package p211026;

public class p14 {
	public static void main(String[] args) {
		//이것이 캡슐화 과정이다.
		
		p13 p = new p13();
		p.setName("홍길동");
		p.setAge(-1);
		System.out.println("이름 : " + p.getName());
		System.out.println("나이 : " + p.getAge());
			
	}
}
