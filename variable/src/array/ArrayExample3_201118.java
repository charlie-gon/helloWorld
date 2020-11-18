
//201118

package array;

public class ArrayExample3_201118 {
	public static void main(String[] args) {

		int num1 = 10, num2 = 20, num3 = 30; //이 중 가장 큰 수는?
		int temp;


		temp = 0;
		int[] intAry = { 34, 25, 57, 39, 55 };
		for (int num : intAry) {
			if (temp < num) {
				temp = num;
			}
		}
		System.out.println("큰 수는: " + temp);
	}

}
