//While 구문으로 1부터 10까지의 합을 구하기

package iteration;

public class WhileMyExample_201116 {
	public static void main(String[] args) {
		int i = 1;
		int sum = 0;
		while (i <= 10) {
			sum += i;
			i++;
			System.out.println(sum);
		}

		int i1 = 1;
		int sum2 = 0;
		while (true) { // true면 사이클 돌아라는 의미
			sum2 += i1;
			if (i1 == 10) {
				break;
			}
			i++; // i가 증가할 수 있는 조건을 주어야 한다
		}
		System.out.println(sum2);
		
		int sum3 = 0;
		for(int i2 = 0; i < 5; i2++) {
			sum3 += i2;
			System.out.println("Hello World" + sum3);
		}
	}

}
