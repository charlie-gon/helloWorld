// Operator(연산자) 실습
//20.11.13

package variable;

public class OperatorExample2 {
	public static void main(String[] args) {

		int num1 = 9;

		int result = 0;

		// num1이 짝수이면 result 변수에는 0 / 홀수이면 1을 넣어라
		// 첫번째는 if 구문으로, 두번째는 삼항(?) 구문으로

		// if구문
		if (num1 % 2 == 0) {
			System.out.println(result);
		} else {
			System.out.println(++result);
		}
		
		// boolean
		boolean result1 = true;
		result1 = (num1 % 2) == 0 ? true : false;
		System.out.println(result1);
		
		// int형
		int result2 = (num1 % 2) == 0 ? 0 : 1;
		System.out.println(result2);
		
		//문자형(String)
		String result3 = (num1 % 2) == 0 ? "True" : "False";
		System.out.println(result3);

	}
}
