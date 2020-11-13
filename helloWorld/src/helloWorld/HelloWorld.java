
//대문자로 시작하는 것은 클래스
//클래스 이외 나머지는 소문자로 시작

package helloWorld;

public class HelloWorld {
	public static void main(String[] args) {
		String name = "30"; //"Hong Kildong"; 숫자 30은 에러 발생, ""사용하면 에러 발생 X
		name = "홍길동"; //"홍길동";
		System.out.println(" My Name is " + name);
		int age = 20;
		System.out.println(" My age is " + age);
		double height = 170.8;
		System.out.println(" 내 키는 " + height + " 입니다. ");
		System.out.println( name + " 키는 " + height + " 입니다. ");
		System.out.println( height + "은 " + name + "의 키입니다.");
		System.out.println( name + "의 나이는 " + age + " 이고 키는 " + height + " 입니다. ");
		
		// 똑같은 변수를 선언할 수 없으므로 다른 이름으로 변수를 만든다.
		String name1 = "김예담";
		int age1 = 22;
		double height1 = 175.3;
		
		System.out.println(name1 + "의 키는 " + height1 + "이고 나이는 " + age1 + "입니다.");
		System.out.println("두 사람 나이의 합은 " + (age + age1) + "입니다."); 
		// 연산 우선순위가 있으므로 ()를 사용하여 더하기나 빼기를 해준다.


		
	}

}