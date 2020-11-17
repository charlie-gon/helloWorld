
//201117
//교재 p.138

package variable;

public class DataTypeExample_201117 {
	public static void main(String[] args) {

		byte num1 = 12; // 1byte
		short num2 = 128; // 2byte
		int num3 = 555555;
		long num4 = 5555555L; // L표시로 long형이라고 알려줌

		byte val1 = 10;
		num3 = val1; // promotion(자동형변환)

		byte result = (byte) (num1 + val1); // casting(수동 형변환)

		num1 = 120;
		for (int i = 0; i < 20; i++) {
			num1++;
			System.out.println(num1);
		}

		char char1 = 97;// 정수에 해당하는 문자타입 출력
		for (int i = 0; i < 26; i++)
			System.out.println(char1++);
		
		float floatVal = 4.567F; //float형이라는 것을 알려주기 위해 F 삽입
		double doubleVal = 3.4567;
	}

}
