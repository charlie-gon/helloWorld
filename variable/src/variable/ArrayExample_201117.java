
//201117
//배열

package variable;

public class ArrayExample_201117 {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;

		int[] numbers = { 10, 20, 30, 40, 50 }; // int[]-> int형 타입의 배열변수(외우라)
//		numbers[0]; //numbers 변수의 첫 번째 값을 가져와라(0부터 시작한다)
		// 배열은 변수 하나로 여러개의 값을 담을 수 있음. 인덱스 값으로 해당 값의 위치 읽어오고
		numbers[1] = 200; // 값을 넣을 수도 있음. 배열 없으면 최상단 int num1과 같이 변수 선언을 일일이 해야 한다

		int sum = 0;
		for (int i = 0; i < 5; i++) {
			System.out.println(numbers[i]);
			sum += numbers[i];
		}
		System.out.println("합계는: " + sum);

		String[] strings = { "Hello", "World", "Nice", "To", "Meet" }; // 문자열 배열
		strings[2] = "Good Good";

		for (int i = 0; i < strings.length; i++) { // strings.length는 배열의 길이를 표시
			System.out.println(strings[i]);
		}
	}

}
