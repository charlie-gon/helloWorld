// Operator(연산자) 실습
//20.11.13

package variable;

public class OperatorExample1 {
	public static void main(String[] args) {
		String str = "Hello";
		str += " World"; // str = str + "World"와 동일한 의미지만 더욱 간결함 / 추천방법
		System.out.println(str);

		int num1 = 10;
		num1 += 5;
		num1 -= 3; // 더하기 뺴기 뿐만이 아니라 곱하기 나누기 또한 가능
		num1 *= 5;
		num1 /= 6;
		System.out.println("num1: " + num1);

		// 이제부터 진짜 중요한거
		int num2 = 10;
		num2++; // ++는 1을 증가시켜라는 의미 / num2 += 1;과 동일한 의미
		num2--; // --는 1을 증감시켜라는 의미
		num2--;
		num2--;
		num2--;
		System.out.println("num2: " + num2);

		int num3 = 10;
		num3 -= 5;
		num3 -= 5;
		num3 -= 5;
		num3 += 15;

		if (num3 > 0) {
			System.out.println("num3은 0보다 큽니다.");
		} else if (num3 < 0) {
			System.out.println("num3은 0보다 작습니다."); // else if 구문을 통해 조건의 복잡성을 증대시킬 수 있음.
		} else {
			System.out.println("num3은 0입니다."); // if,else if 조건을 만족시키지 못한 모든 값을 else로 출력
		}
		
		//몫과 나머지 연산을 활용
		int num4 = 30;
		num4 /= 2; //30을 2로 나눈 몫

//		if (num4 % 2 == 0) {
//			System.out.println("num4는 짝수입니다.");
//		} else {
//			System.out.println("num4는 홀수입니다.");
//		}
		
		//위 수식을 좀 더 간결하게 만들 수 있다.
		
//		boolean result = true;
//		result = (num4 % 2) == 0 ? true : false;
//		System.out.println(result);
		
		
		//정수형으로 변환
		boolean result = true;
		int result = (num4 % 2) == 0 ? 0 : 1;
		System.out.println(result);
		
		//문자형(String)으로 변환
		//삼항 연산자
//		boolean result1 = true;
//		String = (num4 % 2) == 0 ? "True" : "False";
//		System.out.println(result1);
		
		

	}

}
