
//201119
//StudentExample과 연계하여 진행

package variable2;

public class Student_201119 {

	// 필드
	private String sname;
	private int stid;
	private int escore;
	private int mscore;
	
	public void setName(String sname) {
		this.sname = sname;
	}
	
	public void setID(int stid) {
		this.stid = stid;
	}
	
	public void setESCORE(int escore) {
		this.escore = escore;
	}
	
	public void setMSCORE(int mscore) {
		this.mscore = mscore;
	}
	
	//메소드
	public void studentInfo() { //반환값 없음(void)
		System.out.println("이름: " + sname + " 학번: " + stid);

	}
	
	public int totalScore() { //반환값 있음
		return this.escore+mscore;
		// or return excore + mscore
	}
	public void setSNAME(String sname) {
		this.sname = sname;
	}
	public void setSTID(int stid) {
		this.stid = stid;
	}
	public void setEScore(int escore) {
		this.escore = escore;
	}
	public void setMScore(int mscore) {
		this.mscore = mscore;
	}
	
	

}
