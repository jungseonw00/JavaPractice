package p211026;

public class p1 {
	public static void main(String[] args) {
		
		//String 문자열을 붙여주는 것.
		StringBuilder sb = new StringBuilder();
		sb.append("ABC");
		sb.append("DEF");
		sb.append("GHI");
		sb.append("GHI");
		System.out.println(sb.toString());
	}
}
