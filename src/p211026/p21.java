package p211026;

public class p21 {
	String kind;
	p20 eg;
	//p20 객체를 넣는다는 것은 p20 eg가 인스턴스화 되어있을 때 가능
	
	p21 (String kind, p20 eg){
		this.kind = kind;
		this.eg = eg;
	}
	
	void print() {
		System.out.println("종류 : " + kind);
		eg.print();
		System.out.println("============");
	}
	public static void main(String[] args) {
		p20 eg = new p20("알파엔진", 2000);
		p20 eg2 = new p20("베타엔진", 3000);
		
		p21[]c =new p21[3];
		c[0] = new p21("소나타", eg);
		c[1] = new p21("모 닝", eg);
		c[2] = new p21("벤 츠", eg2);
		for (p21 c1 : c) {
			c1.print();
		}

	}

}
