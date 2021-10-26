package p211026;

public class p13 {
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if (age < 0)
			System.out.println("나이 입력 오류");
		else if (age > 0) {
			this.age = age;
		}
	}	
}
