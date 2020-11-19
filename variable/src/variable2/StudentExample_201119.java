
//201119
//Student_201119 클래스를 활용한 필드 선언

package variable2;

public class StudentExample_201119 {
	public static void main(String[] args) {

		Student_201119 s1 = new Student_201119(); // 클래스 이름과 똑같이
		s1.setName("김찬곤");
		s1.setID(5039456);
		s1.setESCORE(80);
		s1.setMSCORE(70);
		
		s1.studentInfo();
		System.out.println(s1.totalScore());
		
		s1.setSNAME("dd");
		s1.setSTID(777777);
		s1.studentInfo();
		
		
		

	}
}
