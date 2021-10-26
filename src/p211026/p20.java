package p211026;

public class p20 {
	String type;
	int cc;
	p20(String type, int cc){
		this.type = type;
		this.cc = cc;
	}
	
	void print() {
		System.out.println("타입 : " + type);
		System.out.println("배기량 : " + cc);		
	}
}
