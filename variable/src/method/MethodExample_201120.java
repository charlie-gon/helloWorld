
//201120

package method;

public class MethodExample_201120 {
	public static void main(String[] args) {
		
		Math_201120 m1 = new Math_201120();
		double sum = m1.sum(10.5, 20); //매개값 반환
		System.out.println(sum);
		
		double getArea = m1.getArea(5.5);
		System.out.println(getArea);
		
		double getRectangle = m1.getRectangle(4.2);
		System.out.println("정사각형의 넓이: " + getRectangle);
		
		getRectangle = m1.getRectangle(4.2, 2.4);
		System.out.println("직사각형의 넓이: " + getRectangle);
		
		int[] ary = {5,10,15,20};
		int getArySum = m1.getArySum(ary);
		System.out.println("배열의 합은: " + getArySum);
		
		
		//적정체중
		Person_201120 p1 = new Person_201120("피카츄", 10, 135.5, 32.5);
		double d1 = m1.getProperWeight(p1);
		if(p1.weight > d1) {
			System.out.println("체중과다");
		}else if(p1.weight < d1) {
			System.out.println("체중미달");
		}else if(p1.weight == d1) {
			System.out.println("적정체중");
		}
		
		
		
		
	}

}
