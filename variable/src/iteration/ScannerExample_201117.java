
//Scanner
//201117

package iteration;

import java.util.Scanner;

public class ScannerExample_201117 {
	public static void main(String[] args) {
		Scanner scn = new  Scanner(System.in);
		System.out.println("숫자만입력.");
		int result = scn.nextInt(); // 숫자/문자 둘 다 입력 시 String result = scn.next(); 
		
		System.out.println("입력값: " + result);
	}

}
