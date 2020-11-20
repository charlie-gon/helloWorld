package variable6;

public class Member_201120 {
	// 필드
		private int mId;
		private String mName;
		private String mMobile;
		private String mClass;
		
		//생성자 (마우스 오른쪽 - Source - Generate Constructor Using Field)
		public Member_201120(int mId, String mName, String mMobile, String mClass) {
			super();
			this.mId = mId;
			this.mName = mName;
			this.mMobile = mMobile;
			this.mClass = mClass;
		}
		
		
		//get,set메소드
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
		@Override
		public String toString() {
			return "Member_201120 [mId=" + mId + ", mName=" + mName + ", mMobile=" + mMobile + ", mClass=" + mClass
					+ "]";
		}
		
		
}
