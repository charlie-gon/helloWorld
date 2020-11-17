// Operator(연산자) 실습
//20.11.13

package variable;

public class OperatorExample {
	public static void main(String[] args) { // main 누르고 ctrl + space 누르면 빵 뜬다
		String str = "Hello";
		str = str + " World"; // 원래 Hello라는 값을 가진 str에 World라는 값을 추가
		str = str + "!!!";
		System.out.println(str);

		int num1 = 10;
		num1 = num1 + 5;
		num1 = num1 + 15;
		System.out.println(num1);

		double num2 = 3.4;
		num2 = num2 * 10;
		num2 = num2 * 100;
		System.out.println(num2);
		
		boolean tf = true; //boolean은 true아니면 false 값만 출력
		tf = !tf; //!의미는 ~가 아니다는 의미 / !tf = tf가 아니다 = false
		tf = !tf; //false인 tf를 다시 부정 = true
		System.out.println(tf);
	}

}
