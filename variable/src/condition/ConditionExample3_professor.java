//ConditionExample3 / 201116

//3의 배수, 5의 배수, 3과 5의 배수 출력(교수님)

package condition;

public class ConditionExample3_professor {
	public static void main(String[] args) {
		int num1 = 15;

		if (num1 % 15 == 0) {
			System.out.println("3과 5의 배수입니다.");
		} else if (num1 % 5 == 0) {
			System.out.println("5의 배수입니다.");
		} else if (num1 % 3 == 0) {
			System.out.println("3의 배수입니다.");
		} else {
			System.out.println("기타등등 입니다.");
		}

		// 논리곱 : 앞에 있는 조건도 만족하고, 뒤에 있는 조건도 만족한다.
		if (num1 % 3 == 0 && num1 % 5 == 0) { // &&기호를 통해 논리곱을 활용할 수 있음
			System.out.println("3과 5의 배수입니다.");
		} else if (num1 % 5 == 0) {
			System.out.println("5의 배수입니다.");
		} else if (num1 % 3 == 0) {
			System.out.println("3의 배수입니다.");
		} else {
			System.out.println("기타등등 입니다.");
		}

	}

}

//Note) if 사용 시 괄호 () 사용할 것