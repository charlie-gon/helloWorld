
//201118

package array;

public class MethodExample_201118 {
	public static void main(String[] args) {
		//두 수를 더해서 2로 나누고 다시 50을 더하고 다시 10나눔.
		
		int num1, num2, result;
		num1 = 34;
		num2 = 55;
		result = sumMethod(num1, num2);
		System.out.println(result);
		
		int val1 = 22, val2 = 55;
		result = sumMethod(val1, val2);
		System.out.println(result);
	}
	//복잡한 수식은 Method에서 한번만 정의해 두고, 필요할 때 불러서 사용한다
	public static int sumMethod(int num1, int num2) {
		int result = num1 + num2;
		result = result / 2;
		result = result + 50;
		result = result / 10;
		return result;
	}
	
}
