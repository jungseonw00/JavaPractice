package p211026;

public class p18 {
	String str;
	private static p18 instance;
	private p18() {
		
	}
	
	public static p18 getInstance() {
		if(instance == null)
			instance = new p18();
		return instance;
	}
}
