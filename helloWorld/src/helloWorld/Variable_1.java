package helloWorld;

public class Variable_1 {

	public static void main(String[] args) {
		int num1 = 5;
		int num2 = 10;
		int sum = 0;
		sum = num1 + num2;
		System.out.println("sum: " + sum);
		
		int diff = num2 - num1;
			
		boolean TrueOrFalse = diff<sum;
		System.out.println(TrueOrFalse);
		
		if(TrueOrFalse) {
			System.out.println("참입니다.");
		}else {
			System.out.println("거짓입니다.");
		}

	}

}
