
//201120
//실행

package variables3;

public class MemberExample_201120 {
	public static void main(String[] args) {
		
		
		//인스턴스 선언
		Member_201120 m1 = new Member_201120();
		m1.mId = 1;
		m1.mName = "김찬곤";
		m1.mMobile = "010-7143-2153";
		m1.mClass = "폴댄스";
		
		m1.showMemberInfo();

		
		Member_201120 m2 = new Member_201120();
		m2.mId = 2;
		m2.mName = "박세민";
		m2.mMobile = "010-7143-2154";
		m2.mClass = "스포츠댄스";
		
		//배열선언
		Member_201120[] members = {m1, m2};
		for(Member_201120 per : members) {
			per.showMemberInfo();
		}
		
		
	}

}
