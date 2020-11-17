//ConditionExample3 / 201116

//3의 배수, 5의 배수, 3과 5의 배수 출력

package condition;

public class ConditionExample3 {
	public static void main(String[] args) {
		int num = 3;
		
		if(num % 3 == 0) {
			System.out.println(num + "은(는) 3의 배수입니다.");
		} else {
			System.out.println(num + "은(는) 3의 배수가 아닙니다.");
		}
		
		int num1 = 15;
		
		if(num1 % 5 == 0) {
			System.out.println(num1 + "은(는) 5의 배수입니다.");
		} else {
			System.out.println(num1 + "은(는) 5의 배수가 아닙니다.");
		}
		
		int num2 = 35;
		
		if(num2 % 3 == 0) {
		} if(num2 % 5 == 0) {
			System.out.println(num2 + "은(는) 3과 5의 배수입니다.");
		} else {
			System.out.println(num2 + "은(는) 3과 5의 배수가 아닙니다.");
		}
	} 
}
