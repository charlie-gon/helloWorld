
//201118

package array;

public class MethodExample1_201118 {
	public static void main(String[] args) {
		showInfo("응응"); // showInfo Method에 정의된 값을 호출
		int result = showDouble(45);

		System.out.println("반환값: " + result);
		System.out.println("반환갑ㅅ: " + showDouble(33.2));
		System.out.println("multi: " + multi(2, 2, 2));
		System.out.println("divide: " + divide(56.7, 30.6));
		System.out.println("divide1: " + divide1(25.1, 22.3));
	}

	public static void showInfo(String name) {
		System.out.println("안녕하세요." + name + "입니다.");
	}

	public static int showDouble(int num) {
		return num * 2;
	

	public static double showDouble(double num) {
		return num * 2;
	}

	// 정수형 변수 2개를 받아서 두 수의 합을 반환해주는 메소드

	public static int sum(int a, int b) {
		int result = 0;
		result = a + b;
		return result;
	}

	// 정수형 변수 3개를 받아서 세 숫자의 곱을 반환 해주는 multi라는 메소드

	public static int multi(int mul1, int mul2, int mul3) {
		int result = 0;
		result = mul1 * mul2 * mul3;
		return result;
	}

	// double 2개를 받아서 첫번째 매개변수를 두번째 매개변수로 나누는 divide 메소드

	public static double divide(double div1, double div2) {
		double result = 0;
		result = div1 / div2;
		return result;
	}

	// double 2개를 받아서 첫번째 매개변수를 두번째 매개변수로 나누는 divide 메소드
	// double 2개를 받아서 큰수를 작은수로 나누는 결과값 리턴

	public static double divide1(double div3, double div4) {
		double result = 0;
		if (div3 > div4) {
			result = div3 / div4;
		} else if (div3 < div4) {
			result = div4 / div3;
		}
		return result;
	}
}
