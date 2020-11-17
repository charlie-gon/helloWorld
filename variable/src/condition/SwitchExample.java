//Switch문
//20.11.13

package condition;

public class SwitchExample {
	public static void main(String[] args) {
		//Math.random()은 0과1사이 임의의 값을 랜덤으로 생성해줌
		//*6을 해주면 0과 6사이(0초과 6미만) 임의 값 랜덤 출력
		//앞에 int붙으면 소수점 없어지고 정수만 랜덤으로 출력
		int randomValue = (int)(Math.random()*6) + 1;
		System.out.println(randomValue);
		
		switch(randomValue) {
		case 1:
			System.out.println("1이구요.");
			break;
		case 2:
			System.out.println("2구요.");
			break;
		case 3:
			System.out.println("3이구요.");
			break;
		case 4:
			System.out.println("4이구요.");
			break;
		case 5:
			System.out.println("5이구요.");
			break;
		case 6:
			System.out.println("6이구요.");
			break;
		}
	}

}
