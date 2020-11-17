
//201117
//교재 4장 확인문제 4번

package iteration;

public class Exercise04_201117 {
	public static void main(String[] args) {

		while (true) {
			int num1 = (int) (Math.random() * 6) + 1;
			int num2 = (int) (Math.random() * 6) + 1;

			if (num1 + num2 != 5) { // if 와 else if는 계속 반복되어야 하기 때문에 while문 안에 집어넣는다
				System.out.println("(" + num1 + "," + num2 + ")");
			} else if (num1 + num2 == 5) { // else if는 if가 선언 되어야만 사용 가능
				System.out.println("(" + num1 + "," + num2 + ")");
				break;
			}
		}

	}

}
