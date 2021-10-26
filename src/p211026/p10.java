package p211026;

class Person{
	String name;
	int age;
	String gender;
	void print() {
		System.out.println("이름 : " + name + "\n나이 : " + age + "\n성별 : " + gender);
	}
}


public class p10 {

	public static void main(String[] args) {
		Person per12 = new Person();
		Person per13 = new Person();
		
		per12.name = "연개소문";
		per12.age  = 62;
		per12.gender = "M";	
		per12.print();
		
		per13.name = "선덕여왕";
		per13.age = 72;
		per13.gender = "W";
		per13.print();
	}

}
