
//201120

package method;

public class Math_201120 {

	private double pi = 3.14;
	

	// 메소드 생성
	public int sum(int a, int b) { //매개변수 a,b설정
		
		return a+b;
	}
	
	public double sum(double a, double b) {
		return a + b;
	}
	
	//getArea 메소드 생성 / pi*r*r 값을 출력하도록 double타입 메소드 설정
	//getArea(r = 5.5)
	public double getArea(double r) {
		return pi*r*r;
	}
	
	//정사각형 넓이: getRectangle, 매개변수: 4.2
	public double getRectangle(double a) {
		return a*a;
	}
	
	//직사각형의 넓이, 매개변수: 4.2, 2.4
	public double getRectangle(double a, double b) {
		return a*b;
	}
	
	//int 배열의 합을 구하는 메소드
	public int getArySum(int[] ary) {
		int sum = 0;
		for(int num : ary) {
			sum += num;
		}
		return sum;
	}
	
	//사람의 적정 몸무게 구하는 메소드 / Person
	
	public double getProperWeight(Person_201120 p1) { //method 패키지 안의 Person 크래스를 매개변수로
		//공식: (키-100)*0.9
		double properWeight = (p1.height-100)*0.9;
		return 0;
	}
	
	public double getProperWeight(double height) { //method 패키지 안의 Person 크래스를 매개변수로
		//공식: (키-100)*0.9
		double properWeight = (height-100)*0.9;
		return 0;
	}
	
	
	
	

}
