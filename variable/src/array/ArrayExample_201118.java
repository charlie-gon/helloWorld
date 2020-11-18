
//201118
//int의 기본값은 0

package array;

public class ArrayExample_201118 {
	public static void main(String[] args) {
		int[] intAry = new int[5];
		intAry[0] = 15;
		intAry[4] = 33;
		// 첫번째, 마지막 위치 제외 나머지 공간에는 int 기본값으로 0이 출력됨 / String문자형의 경우 기본값은 NULL
		for (int i = 0; i < 5; i++) {
			System.out.println(intAry[i]);
		}

		double[] doubleAry;
		doubleAry = new double[] { 2.3, 2.2, 1.6 };
		System.out.println(doubleAry[0]);
		double sum = 0;
		for (int i = 0; i < doubleAry.length; i++) {
			sum += doubleAry[i];
		}
		System.out.println(sum);
		
		// 확장 for(enhanced for) / 안외우면 백수
		sum = 0;
		for(double dbl : doubleAry) { //doubleAry라는 배열의 크기만큼 반복하여 실행
			sum += dbl;
//			System.out.println(dbl);
		}
		System.out.println("sum: " + sum);
		
		for(int yd : intAry) {
			System.out.println("yd: " + yd);
		}
		
		
	}

}
