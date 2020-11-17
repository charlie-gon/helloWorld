//iteration_201116
//반복구문

//for를 활용하여 Hello World를 다섯번 반복하는 반복문 출력

package iteration;

public class ForMyExample_201116 {
	public static void main(String[] args) {
		int sum = 0;

		for (int i = 0; i < 10; i++) {
			sum += 4;
			System.out.println("헬로우 월드" + sum);
		}

		// 1부터 10까지 더하기
		int sum1 = 0;
		for (int i = 0; i < 11; i++) {
			sum1 += i;
			System.out.println(sum1);
		}

		// 짝수만 더하기
		int sum2 = 0;
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				sum2 += i;
			} 
		}
		System.out.println("짝수만 더하면: " + sum2);
	}

}

//Debug(F11)모드에서 StepOver(F6)를 통해 프로세스를 확인할 수 있다