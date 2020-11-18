
//201118

package variable;

public class MorningCode_201118 {
	public static void main(String[] args) {
		int Numbers[] = { 23, 56, 34, 65, 28, 21 };
		int sum = 0;
		int sum1 = 0;
		
		for (int i = 0; i < Numbers.length; i++) { // i < Numbers.length에서 <= 를 사용하지 않는 이유: 실제 갯수는 6개 - 변수 i가 배열에서 시작되는 순서는 0(0-5) 
			if (Numbers[i] % 2 != 0) {
				sum += Numbers[i];
			}
		}
		System.out.println("홀수의 합은: " + sum);

		for (int x = 0; x < Numbers.length; x++) {
			sum1 += Numbers[x];
		}
		System.out.println("전체 합의 평균은: " + sum1 / Numbers.length);

	}

}
