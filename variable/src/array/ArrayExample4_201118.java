
//201118
//2차원 배열

package array;

public class ArrayExample4_201118 {
	public static void main(String[] args) {
		int[][] intAry = new int[3][3]; // 크기 지정을 해야함 / 첫번째[]:행 두번째[]:열
		intAry[0] = new int[] { 11, 12, 13 };
		intAry[1] = new int[] { 21, 22, 23 };
		intAry[2] = new int[] { 31, 32, 33 };

		System.out.println(intAry[0][0]);
		System.out.println(intAry[0].length);
		
		for(int i =0; i<intAry.length; i++) {
			for(int j = 0; j<intAry[i].length; j++) {
				System.out.println("intAry["+i+" , "+j+"]>" + intAry[i][j]);
			}
		}

		// 2차원 배열의 또다른 표현법		
		// 배열의 길이는 행의 갯수
		int[][] intAry2 = { { 11, 12, 13 }, { 21 }, { 31, 32, 33 }, };
		
		//intAry2의 배열의 각 합, 평균
		//intAry[0] => 합? 평균?
		//intAry[1] => 합? 평균?
		//intAry[2] => 합? 평균?
		
		
		

		System.out.println(intAry2[1].length);
	}
}
