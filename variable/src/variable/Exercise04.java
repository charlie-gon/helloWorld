//교재 p.103 문제 4번
//20.11.13

package variable;

public class Exercise04 {
	public static void main(String[] args) {
		int pencils = 534;
		int students = 30;
		
		int pencilsPerStudent = (pencils/students);
		System.out.println(pencilsPerStudent);

		int pencilsLeft = pencils % students;
		System.out.println(pencilsLeft);
	}

}
//문장정렬 : ctrl + shift + F