package Chapter12.v4.TreeSet;

import java.util.Comparator;

public class Member2 implements Comparator<Member2> {

    private int memberId;
    private String memberName;

    public int getMemberId() {
        return memberId;
    }

    public Member2(int memberId, String memberName) {
        this.memberId = memberId;
        this.memberName = memberName;
    }

//    compare() 메서드 재정의. 전달받은 두 매개변수를 배교함
    @Override
    public int compare(Member2 o1, Member2 o2) {
        return o1.getMemberId() - o2.getMemberId();
    }
}
