package Chapter12.v4.TreeSet;


public class MemberTreeSetTest {
    public static void main(String[] args) {
        MemberTreeSet memberTreeSet = new MemberTreeSet();

        Member memberPark = new Member(1003, "박서훤");
        Member memberLee = new Member(1001, "이지원");
        Member memberSon = new Member(1002, "손민국");

        memberTreeSet.addMember(memberLee);
        memberTreeSet.addMember(memberSon);
        memberTreeSet.addMember(memberPark);
        memberTreeSet.showAllMember();

        Member memberHong = new Member(1003, "홍길동");
        memberTreeSet.addMember(memberHong);
        memberTreeSet.showAllMember();

//        class Chapter12.v4.Member cannot be cast to class java.lang.Comparable
//        (Chapter12.v4.Member is in unnamed module of loader 'app'; java.lang.Comparable is in module java.base of loader 'bootstrap')

//        Comparable 인터페이스를 구현하지 않았다는 의미는 우리가 만든 Member클래스를 TreeSet의 요소로 추가할 때 어떤 기준으로 노드를 비교하여 트리를 형성해야 하는지를 구현하지 않았다는 뜻이다.
//        따라서 회원을 TreeSet에 추가할 때 어떤 기준으로 비교할 것인지를 구현해 주어야 한다. 이때 사용하는 인터페이스가 comparable 또는 Comparator이다.


//        ----------- compareTo 추가후 ------------
//        이지원 회원님의 아이디는 1001입니다.
//        손민국 회원님의 아이디는 1002입니다.
//        박서훤 회원님의 아이디는 1003입니다.

    }
}
