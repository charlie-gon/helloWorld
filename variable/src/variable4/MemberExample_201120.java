
//201120

package variable4;

public class MemberExample_201120 {
	public static void main(String[] args) {
		
		Member m1 = new Member();
		m1.setmId(7);
		m1.setmName("김찬곤");
		m1.setmMobile("010-1234-5678");
		m1.setmClass("요가");
		//Member 클래스에서 만든 set메소드를 활용하여 값 할당
		
		
		//Member 클래스에서 만든 get메소드를 활용하여 값 출력
		System.out.println(m1.getmId());
		System.out.println(m1.getmClass());
		
		//Member 클래스에서 만든 toString으로 값 출력
		System.out.println(m1);
	}

}
