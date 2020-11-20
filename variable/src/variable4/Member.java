
//201220

package variable4;

public class Member {

	// 필드
	private int mId;
	private String mName;
	private String mMobile;
	private String mClass;
	
	public int getmId() {
		return mId;
	}
	public void setmId(int mId) {
		this.mId = mId;
	}
	public String getmName() {
		return mName;
	}
	public void setmName(String mName) {
		this.mName = mName;
	}
	public String getmMobile() {
		return mMobile;
	}
	public void setmMobile(String mMobile) {
		this.mMobile = mMobile;
	}
	public String getmClass() {
		return mClass;
	}
	public void setmClass(String mClass) {
		this.mClass = mClass;
	}
	@Override //마우스 오른쪽 - source - Generate toString
	public String toString() {
		return "회원번호=" + mId + ", 회원이름=" + mName + ", 연락처=" + mMobile + ", 강좌=" + mClass + "]";
	}

	

}
