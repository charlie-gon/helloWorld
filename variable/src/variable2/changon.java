package variable2;

public class changon {
	
	//필드
private	String name;
private	int age;
private	int height;
private	int weight;


	
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void age(int age) {
		this.age = age;
	}
	
	public void height(int height) {
		this.height = height;
	}
	
	public void weight(int weight) {
		this.weight = weight;
	}
	
	//메소드
	
	public void changonInfo() {
		System.out.println(name + " " + age + " " + height + " " + weight);
	}
	
	public void setName1(String name) {
		this.name = name;
	}
	
	public void age1(int age) {
		this.age = age;
	}
	
	public void setWeight(int weight) {
		if(weight > 100)
			System.out.println("과체중입니다.");
		else
			System.out.println("정상체중입니다.");
	}
	
	
	

}
