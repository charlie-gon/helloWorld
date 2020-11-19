
//201119

package variable2;

public class VariableExample_201119 {
	public static void main(String[] args) {
		String name = "Hong";
		int age = 10;
		double height = 178.2;

		String name1 = "Gwang";
		int age1 = 23;
		double height1 = 122.2;

		// variable2 package에 Person이라는 클래스 생성 후 아래 내용 진행
		// Person에서 만든 실체를 아래와 같은 인스턴스로 만들어낸다

//		Person p1 = new Person(); // 생성된 Person class 필드 선언하였기 때문에 읽어올 수 있음
//		p1.name = "Hong";
//		p1.setName("홍");//필드에 값을 저장 및 불러오는 기능
//		p1.age = 10;
//		p1.setAge(20);//필드에 값을 저장 및 불러오는 기능
//		p1.height = 178.8;

		// 생성자 실습
		System.out.println("생성자 실습요 --------------------------------");

		Person p1 = new Person("Choi", 20, 177.5, 75.3);
		System.out.println(p1.getName());
		System.out.println(p1.getAge());

		System.out.println("-----------------------------------------");

		p1.setName("홍");
		p1.setAge(10);
		p1.setHeight(177.8);
		System.out.println("p1의 이름: " + p1.getName());
		System.out.println("p1의 나이: " + p1.getAge());
		System.out.println("p1의 키: " + p1.getHeight());

		p1.showInfo();

		Person p2 = new Person();
//		p2.name = "호롱박";
//		p2.age = 17;
//		p2.height = 166.8;
//		p2.setHeight(158);
//		p2.showInfo();

		Person p3 = new Person();
//		p3.name = "HHH";
//		p3.age = 44;
//		p3.height = 555;
//		p3.weight = 44;
//		p3.showInfo();

		// Person을 담을 수 있는 배열

		Person[] persons = { p1, p2, p3 };
		for (Person per : persons) {
			per.showInfo();
		}
//		System.out.println(p1.name);
//		System.out.println(p1.age);
//		System.out.println(p1.height);
//		System.out.println(p2.age);
//		System.out.println(p3.weight);
	}

}
