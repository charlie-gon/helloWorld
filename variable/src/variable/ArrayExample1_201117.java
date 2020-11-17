
//201117
//배열 연습
//배열에 정수 10-100까지 넣은 다음 10부터 100까지의 합 중 홀수번째 위치의 수만 합하도록 설정
package variable;

public class ArrayExample1_201117 {
	public static void main(String[] args) {
		int[] numbers = {10,20,30,40,50,60,70,80,90,100};
		int sum = 0;
		for(int i = 0; i <numbers.length; i++) {
			
			sum += numbers[i];
		
			
		}System.out.println(sum);
	}

}
