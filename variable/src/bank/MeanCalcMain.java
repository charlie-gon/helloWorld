package bank;

import java.util.Scanner;

public class MeanCalcMain {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		boolean run = true;

		while (run) {
			System.out.println("1.버스요금 2.점심식사 비용 3.총생활비 4.종료");
			System.out.print("선택> ");

			int selectNo = scn.nextInt();
			scn.nextLine();

			if (selectNo == 1) {
				System.out.print("버스요금을 입력하세요> ");
				int busFare = scn.nextInt();
				System.out.print("횟수를 입력하세요> ");
				int busNo = scn.nextInt();
				MeanCalc bus = new MeanCalc(busFare, busNo);
				bus.getbus();
			} else if(selectNo == 2) {
				System.out.print("점심식사 비용을 입력하세요> ");
				int lunchFare = scn.nextInt();
				MeanCalc lunch = new MeanCalc(lunchFare);
				lunch.getlunch();
				
			}  else if(selectNo ==3) {
				//총생활비를 나열하려면 배열을 선언하여 진행해야겠다.
			}
			

		}//end of while
		System.out.println("프로그램 종료");

	}//end of main

}
//if문을 추가하여 총 비용에 따라 "절약이 필요합니다." 혹은 "적절합니다."와 같은 문구가 출력되도록 만들어도 재밌겠다.
