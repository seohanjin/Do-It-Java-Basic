package Chapter12.v5;

import Chapter12.v4.Member;

public class MemberTreeMapTest {
    public static void main(String[] args) {
        MemberTreeMap memberTreeMap = new MemberTreeMap();

        Member memberPark = new Member(1003, "박서훤");
        Member memberLee = new Member(1001, "이지원");
        Member memberHong = new Member(1004, "홍길동");
        Member memberSon = new Member(1002, "손민국");

        memberTreeMap.addMember(memberPark);
        memberTreeMap.addMember(memberLee);
        memberTreeMap.addMember(memberHong);
        memberTreeMap.addMember(memberSon);

        memberTreeMap.showAllMember();

        memberTreeMap.removeMember(1004);
        memberTreeMap.showAllMember();


    }
}
