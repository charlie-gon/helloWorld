
//201119

package variable2;

public class Person {

	// 필드
	private String name;
	private int age;
	private double height;
	private double weight;

	// 필드에 private 사용하면 외부수정(접근) 방지(숨길 수 있다)
	// ex. private String name;
	// private int age;
	// private double height;
	// private double weight;

	// 생성자: 필드의 초기값 지정. 반환타입이 없다
	public Person() {
		this.name = "초기이름";
		this.age = 10;
		this.height = 170.0;
		this.weight = 65.0;
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	} // 이름과 나이만 초기화. 나머지 값은 디폴트값으로(필드의 초기값)

	public Person(String name, int age, double height, double weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	// 메소드
	public void showInfo() { // showInfo 메소드 호출하면 됨
		System.out.println("이름: " + name); // name = 필드
		System.out.println("나이는: " + age);
		System.out.println("키는: " + height);
		System.out.println();
	}

	// 필드에 값을 저장 및 불러오는 기능

	public String getName() {
		return this.name; // or return.name;
	}

	public int getAge() {
		return this.age;
	}

	public double getHeight() {
		return this.height;
	}

	public double getWeight() {
		return this.weight;
	}

	public void setName(String name) { // Person 클래스 name을 변수로 지정
		this.name = name;
	}

	public void setAge(int age) {
		if (age > 0) // if문을 활용해 세부설정 가능
			this.age = age;
		else
			this.age = 0;
	}

	public void setHeight(double height) {

		this.height = height;
	}
}
