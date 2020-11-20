
//201120
//생성자

package variable5;

public class Member_201120 {
	// 필드
		private int mId;
		private String mName;
		private String mMobile;
		private String mClass;
		
		//생성자 만들기
		//클래스 이름 삽입
		//기본생성자:매개변수 없다
		public Member_201120() { 
			
		}
		
		//set메소드
		//회원번호, 이름만 출력해주는 생성자
		public Member_201120(int mId, String mName) {
			this.mId = mId;
			this.mName = mName;
		}
		
		public Member_201120(int mId, String mName, String mMobile, String mClass) {
			this.mId= mId;
			this.mName = mName;
			this.mMobile = mMobile;
			this.mClass = mClass;
		}
	
	//get메소드
		public int getmId() {
			return mId;
		}
		public String getmName() {
			return mName;
		}
		public String getmMobile() {
			return mMobile;
		}
		public String getmClass() {
			return mClass;
		}
		
		
}
