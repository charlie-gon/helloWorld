//for문을 활용해 구구단 만들기

package iteration;

public class ForMultiTable_201116 {
	public static void main(String[] args) {
		int num = 2;

		for (int i = 1; i < 10; i++) {
			num = 2 * i;
			System.out.println(num);
		}

		for (int i = 1; i < 10; i++) {
			System.out.println(3 * i);
		}

		num++;
		for (int i = 1; i <= 9; i++) {
			System.out.println(num + " * " + i + " = " + (num * i));
		}

		// 반복문 안에 반복문
		// 2로 한싸이클 돌고 그 다음에 num1++해서 3으로 한싸이클 돌고 이런 방식으로 9까지 반복
		for (int num1 = 2; num1 <= 9; num1++) {
			for (int i = 1; i <= 9; i++) {
				System.out.println(num1 + " * " + i + " = " + (num1 * i));
			}

		}

	}
}
