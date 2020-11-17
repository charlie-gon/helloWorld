
//Scanner
//201117
//교재 4장 확인문제 7번
//외우세요

package iteration;

import java.util.Scanner;

public class ScannerPractice_201117 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		boolean run = true;
		int balance = 0; // 초기값(첫번째 값으로 넣어준다)

		while (run) {
			System.out.println("-----------------------");
			System.out.println("1.예금 2.출금 3.잔고 4.종료");
			System.out.println("-----------------------");
			System.out.print("선택> ");
			int menu = scn.nextInt(); // 사용자의 입력을 기다리도록 만드는 명령어
			if (menu == 1) {
				System.out.print("예금액> ");
				balance += scn.nextInt(); //기존 금액에서 누적
				
			} else if (menu == 2) {
				System.out.print("출금액> ");
				balance -= scn.nextInt();
				
			} else if (menu == 3) {
				System.out.println("잔고> " + balance);

			} else if (menu == 4) {
				run = false;
			}
		} // end of while
		System.out.println("프로그램 종료.");
	} // end of main()

}
