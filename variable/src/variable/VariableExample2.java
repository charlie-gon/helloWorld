//num1, num2 중에서 큰 수에서 작은 수를 뺀 결과값을 result에 대입
//Professor
//20.11.13

package variable;

public class VariableExample2 {
	public static void main(String[] args) {
		int num1, num2, result;
		String resultStr = "결과값은 ";

		num1 = 30;
		num2 = 20;

		if (num1 > num2) {
			result = num1 - num2;
		} else {
			result = num2 - num1;
		}
		System.out.println(resultStr + result);
	}
}
//문장정렬 : ctrl + shift + F