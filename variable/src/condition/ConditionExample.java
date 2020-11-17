// Operator(연산자) 실습
//20.11.13

package condition;

public class ConditionExample {
	public static void main(String[] args) {
		int score = 60;
		String grade = "";

		// 70점 이상 C, 60점 이상 D, 60점 미만 F
		if (score >= 90) {
			if (score >= 95) {
				grade = "A+";
			} else {
				grade = "A"; // if 안에 if를 사용했을 때 else를 사용해 조건을 좀 더 명확히 만들어 준다
			}
		}

		else if (score >= 80) {
			if (score >= 85) {
				grade = "B+";
			} else {
				grade = "B";
			}
		}

		else if (score >= 70) {
			if (score >= 75) {
				grade = "C+";
			} else {
				grade = "C";
			}
		}
		
		else if(score >= 60) {
			if(score >= 65) {
				grade = "D+";
			} else {
				grade = "D";
			}
		}

		System.out.println(score + "점은 " + grade + "입니다.");
	}
}
