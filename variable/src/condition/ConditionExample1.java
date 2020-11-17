// if 여러개 사용하기
//20.11.13

package condition;

public class ConditionExample1 {
	public static void main(String[] args) {
		int score = 90;
		String grade = "";
		
		// 70점 이상 C, 60점 이상 D, 60점 미만 F
		// else if 아니고 if만 여러개 반복했을 경우
		if (score >= 90) {
			grade = "A";
		}  if (score >= 80) {
			grade = "B";
		}  if (score >= 70) {
			grade = "C";
		}  if (score >= 60) {
			grade = "D";
		} if (score < 60) {
			grade = "F";
		}
		System.out.println(score + "점은 " + grade + "입니다.");
	}
}

// 90점을 넣었는데 결과값이 D가 나옴 = 여러 조건을 만족하기 때문에 내려가다가 최종적으로 끝나는 조건의 결과값 출력했기 때문
// else if를 사용하면 if를 한번만 사용하기 때문에 위와 같은 문제를 방지할 수 있음