
//Variable(변수)

//String(문자) / int(숫자 정수) / double(숫자 소수도 오케이)

package helloWorld;

public class Variable {

	public static void main(String[] args) {
		int num1 = 30;
		int num2 = 20;
		
		int sum = 40;
//		sum = num1 + num2;
//		System.out.println("sum: " + sum);
//		sum = num1 % num2; // 0.5인데 정수만 담을 수 있는 타입이라(int) 소수점 출력 안함
//		System.out.println("sum: " + sum);
		sum = num1 % num2; // num1 을 num2로 나눈 나머지 몫을 구함
		
		//boolean은 조건의 참,거짓을 구분할 때 사용
		boolean TrueOrFalse = sum <= 10;
		System.out.println(TrueOrFalse);
		
		if(TrueOrFalse) {
			System.out.println("결과 참입니다.");
		}else {
			System.out.println("결과 거짓입니다.");
		}
		
		
	}

}
