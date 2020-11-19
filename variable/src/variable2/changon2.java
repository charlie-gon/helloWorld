package variable2;

public class changon2 {
	public static void main(String[] args) {
		
		//changon 클래스에서 선언된 필드를 읽어오기 위해 선언된 생성자 호출 및 객체 생성
//		changon s1 = new changon();
//		s1.name = "김예담";
//		s1.age = 24;
//		s1.height = 180;
//		s1.weight = 77;
//		
//		System.out.println(s1.name + " " + s1.age + " " + s1.height + " " + s1.weight);
		
		
		
		changon s2 = new changon();
		s2.setName("김예담");
		s2.age(324);
		s2.height(200);
		s2.weight(77);
		
		s2.changonInfo();
		
		s2.setName1("김담예");
		s2.age1(30);
		s2.changonInfo();
		
		s2.setName("김찬곤");
		s2.setWeight(90);
		
		
		

	}

}
