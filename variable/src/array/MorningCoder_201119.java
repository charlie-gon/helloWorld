
//201119

package array;

public class MorningCoder_201119 {
	public static void main(String[] args) {

		int num = 1;
		int[][] intAry = new int[5][5];
		
		for (int i = 0; i < intAry.length; i++) {
			for (int j = 0; j < intAry[i].length; j++) {
				intAry[i][j] += num;
			}
		}
		for (int i = 0; i < intAry.length; i++) {
			for (int j = 0; j < intAry[i].length; j++) {
				System.out.print(num + " ");
			}
			System.out.println();
		}
		
		String[] strAry = {"F", "You"};
		for(String str : strAry) {
			System.out.println(str);
		}

	}
}