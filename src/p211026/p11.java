package p211026;

public class p11 {
	String color;
	int speed;
	
	void speedUp() {
		System.out.println(speed + "속도향상");
	}
	
	void speedDown() {
		System.out.println(speed + "속도저하");
	}
	
	void print() {
		System.out.println("색깔:" + color);
		System.out.println("속도:" + speed);
	}
}
