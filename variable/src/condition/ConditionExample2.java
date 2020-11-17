// Switch문
//20.11.13

package condition;

public class ConditionExample2 {
	public static void main(String[] args) {
		int score = 90;
		score /= 10;
		String grade = "";

		// 70점 이상 C, 60점 이상 D, 60점 미만 F
		// else if 아니고 if만 여러개 반복했을 경우

		/*
		 * switch (score) { case 9: grade = "A"; break; //하나의 케이스에 만족했으면 빠져 나오라는 의미 case
		 * 8: grade = "B"; break; case 7: grade = "C"; break; case 6: grade = "D";
		 * break; default: grade = "F"; }
		 * 
		 * System.out.println((score*10) + "점은 " + grade + "입니다.");
		 */

		
		//break를 두개씩 띄워서 넣으면 두 점수 범위로 넓힐 수 있음
		switch (score) {
		case 9:
		case 8:
			grade = "양호";
			break;
		case 7:
		case 6:
			grade = "보통";
			break;
		default:
			grade = "미흡";
		}

		System.out.println((score * 10) + "점은 " + grade + "입니다.");
	}
}
