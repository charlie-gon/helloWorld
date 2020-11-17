//1~50까지의 정수 중 7의 배수는 sum7에 8의 배수는 sum8에 합하여라(for) / while문으로도 작성
//201117

package iteration;

public class MorningCode_201117 {
	public static void main(String[] args) {

		int sum7 = 0;
		int sum8 = 0;
		
		for (int x = 1; x <= 50; x++) {
			if (x % 7 == 0) {
				sum7 += x;
			}

			if (x % 8 == 0) {
				sum8 += x;
			}
		}
		System.out.println("sum7의 합: " + sum7);
		System.out.println("sum8의 합: " + sum8);
		
		int i = 1;
		int sum77 = 0;
		int sum88 = 0;

		while (true) {
			if (i % 7 == 0) {
				sum77 += i;
				System.out.println(sum77);
			} else if (i % 8 == 0) {
				sum88 += i;
				System.out.println(sum88);
				i++;
				break;
			}
		}
	

	}

}
