package Chapter12.v5;

import Chapter12.v4.Member;

public class MemberHashMapTest {
    public static void main(String[] args) {
        MemberHashMap memberHashMap = new MemberHashMap();

        Member memberLee = new Member(1001, "이지원");
        Member memberSon= new Member(1002, "손흥민");
        Member memberPark = new Member(1003, "박상아");
        Member memberHong = new Member(1004, "홍길동");

        memberHashMap.addMember(memberLee);
        memberHashMap.addMember(memberSon);
        memberHashMap.addMember(memberPark);
        memberHashMap.addMember(memberHong);

        memberHashMap.showAllMember();

        memberHashMap.removeMember(1004);
        memberHashMap.showAllMember();


//        이지원 회원님의 아이디는 1001입니다.
//        손흥민 회원님의 아이디는 1002입니다.
//        박상아 회원님의 아이디는 1003입니다.
//        홍길동 회원님의 아이디는 1004입니다.
//
//        이지원 회원님의 아이디는 1001입니다.
//        손흥민 회원님의 아이디는 1002입니다.
//        박상아 회원님의 아이디는 1003입니다.
    }
}
