package Chapter12.v4.HashSet;

import Chapter12.v4.Member;

import java.util.HashSet;

public class MemberHashSetTest {
    public static void main(String[] args) {
        MemberHashSet memberHashSet = new MemberHashSet();

        Member memberLee = new Member(1001, "이지원");
        Member memberSon = new Member(1002, "손민국");
        Member memberPark = new Member(1003, "박서훤");

        memberHashSet.addMember(memberLee);
        memberHashSet.addMember(memberSon);
        memberHashSet.addMember(memberPark);
        memberHashSet.showAllMember();

        Member memberHong = new Member(1003, "홍길동");
        memberHashSet.addMember(memberHong);
        memberHashSet.showAllMember();

//        이지원 회원님의 아이디는 1001입니다.
//        박서훤 회원님의 아이디는 1003입니다.
//        손민국 회원님의 아이디는 1002입니다.
//
//        이지원 회원님의 아이디는 1001입니다.
//        박서훤 회원님의 아이디는 1003입니다.
//        홍길동 회원님의 아이디는 1003입니다.
//        손민국 회원님의 아이디는 1002입니다.

//        String 클래스는 해당 클래스에 객체가 동일한 경우에 대한 처리 방법이 이미 구현되어 있기 때문에 두 번 추가 되지 않았다.

    }
}
