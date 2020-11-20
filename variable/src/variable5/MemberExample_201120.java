
//201120
//생성자

package variable5;

public class MemberExample_201120 {
	public static void main(String[] args) {
		Member_201120 m1 = new Member_201120();
		System.out.println("이름: " + m1.getmName());
		
		Member_201120 m2 = new Member_201120(1, "Hong", "010-1234-5678", "수영");
		System.out.println(m2.getmName()); 
		//set 메소드로 값 지정하지 않았는데도 출력됨
		//생성자를 통해서 값을 지정했기 때문에 출력됨
		
		Member_201120 m3 = new Member_201120(2, "Hwang");
		System.out.println(m3.getmName());
		
	}

}
