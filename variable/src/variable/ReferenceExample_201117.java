
//201117
//5단원 레퍼런스 타입에 대한 설명

package variable;

public class ReferenceExample_201117 {
	public static void main(String[] args) {
		String str1 = "Hello"; // str1 변수에는 Hello가 가지고 있는 주소값이 담겨진다.
		String str2 = "Hello";
		String str3 = new String("Hello");

		if (str1.equals(str3)) { // str1과 str2의 주소값 비교 / .equals 사용하면 주속밧이 아니라 표면의 값(Hello)을 비교
			System.out.println("동일한 주소값.");
		} else {
			System.out.println("다른 주소값.");
		}
	}
	//str1,2는 동일한 주소값. 하지만 new라는 이름으로 만들면 새로운 주소값 생성해줌

}
