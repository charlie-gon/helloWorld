//iteration_201116
//반복구문
package iteration;

public class ForExample_201116 {
	public static void main(String[] args) {
		int sum = 0;

		// 외우기
		// int i = 0;(초기값), i < 10(조건식), 0부터 9까지 10번 실행했으므로 결과값은 100
		for (int i = 0; i < 10; i++) { // or i += 2
			sum += 10;
			System.out.println("i: " + i);
			System.out.println("sum: " + sum);
		}
		
	}

}
