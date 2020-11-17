//num1, num2 중에서 큰 수에서 작은 수를 뺀 결과값을 result에 대입
//Myself
//20.11.13

package variable;

public class VariableExample {
	public static void main(String[] args) {
		int num1 = -30;
		int num2 = -45;
		int result1 = num1 - num2;
		int result2 = num2 - num1;

		if (num1 > num2) {
			System.out.println("결과값은: " + result1);
		} else {
			System.out.println("결과값은: " + result2);
		}

	}

}

// 문장정렬 : ctrl + shift + F