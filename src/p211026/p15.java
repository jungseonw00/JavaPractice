package p211026;

public class p15 {
	static private p15 instance;
	
	private int volume;
	
	private p15() {
		volume = 5;
	}
	
	public static p15 getInstance() {
		if (instance == null) {
			//시스템 스피커
			instance = new p15();
		}
		return instance;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public static void setInstance(p15 instance) {
		p15.instance = instance;
	}
	
}
