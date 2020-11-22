
//201122
//버스요금과 점심식사 비용으로 한 달 총 생활비 구하기

package bank;

public class MeanCalc {

	// 필드
	private int bus;
	private int lunch;
	private int number;
	private int sum;

	// 생성자
	public MeanCalc(int bus, int number) {
		this.bus = bus;
		this.number = number;
	}
	
	public MeanCalc(int lunch) {
		this.lunch = lunch;
	}
	
	public MeanCalc(int bus, int lunch, int sum) {
		this.sum = sum;
	}
	
	// get,set 메소드
	public int getbus() {
		System.out.println("한달 교통비는: " + this.bus * this.number * 30);
		return bus;
	}

	public void setbus(int bus) {
		this.bus = bus*number;
	}

	public int getlunch() {
		System.out.println("한달 점심식사 비용은: " + this.lunch * 30);
		return lunch;
	}

	public void setlunch(int lunch) {
		this.lunch = lunch*number;
	}

	public int getsum() {
		System.out.println("한달 생활비는: " + (this.bus + this.lunch)*30);
		return sum;
	}

	public void setsum(int bus, int lunch) {
		int sum = bus + lunch;
		this.sum = sum;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

}// end of MeanCalc class
