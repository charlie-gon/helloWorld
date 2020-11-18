
//201118

package array;

public class ArrayExample2_201118 {
	public static void main(String[] args) {
		double[] dAry;
		dAry = new double[] { 23.2, 55.3, 52.8, 62.8 };

		double sum = doubleSum(dAry);
		System.out.println(sum);

		double divide = doubleDiv(dAry);
		System.out.println(sum / dAry.length);

	}

	// double형 배열 => 23.2, 55.3, 52.8, 62.8 : dAry선언
	// method: doubleSum(), 매개변수 : double[]
	// 반환해주는 값: double

	public static double doubleSum(double[] dAry) {
		double sum = 0;
		for (double num : dAry) {
			sum += num;
		}
		return sum;

	}

	public static double doubleDiv(double[] dAry) {
		double sum = 0;
		for (double num : dAry) {
			sum += num;
		}
		return sum;
	}

}
