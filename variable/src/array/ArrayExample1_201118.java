
//201118
//메소드와 배열

package array;

public class ArrayExample1_201118 {
	public static void main(String[] args) {
		int[] intAry;
		int sum = 0;
		intAry = new int[] { 24, 66, 82 };

		int[] intAry3 = { 11, 22, 33, 44, 55, 66, 77 };

		for (int i = 0; i < intAry.length; i++) {
			sum += intAry[i];
		}
		
		System.out.println("세 숫자의 합은: " + sum);

		sum = sumAry2(intAry);
		System.out.println("세 숫자의 합은: " + sum);

		sum = sumAry2(intAry3);
		System.out.println("세 숫자의 합은: " + sum);
	}

	public static int sumAry2(int[] ary) {
		int sum = 0;
		for (int num : ary) {
			sum += num;
		}
		return sum;
	}

}
