
//201120

package method;

public class MethodExample1_201120 {
	public static void main(String[] args) {
		
		Rectangle_201120 r1 = new Rectangle_201120();
		
		r1.drawRectangle(); //반환값이 없으므로 앞에 정수형이니 뭐니 정의가 필요 없다
		
		String result = r1.getRectangle(); //결과만 담은 상태. 출력하려면 출력문 작성해야
		System.out.println("결과: " + r1.getRectangle());
		
		r1.drawShape("O");
	}

}
