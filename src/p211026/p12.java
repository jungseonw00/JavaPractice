package p211026;

public class p12 {

	public static void main(String[] args) {
		
		p11 myp11 = new p11();
		p11 youp11 = new p11();
		myp11.color = "블루";
		myp11.speed = 200;
		myp11.speedUp();
		myp11.speedDown();
		myp11.print();
		System.out.println("---------------------------");
	
		youp11.color = "빨강";
		youp11.speed = 120;
		youp11.speedUp();
		youp11.speedDown();
		youp11.print();

	}
}
