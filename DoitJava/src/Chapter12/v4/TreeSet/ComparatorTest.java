package Chapter12.v4.TreeSet;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class MyCompare implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
//        내림차순으로 정렬
        return (o1.compareTo(o2)) * -1;
    }
}

public class ComparatorTest {
    public static void main(String[] args) {
//        TreeSet 생성자의 매개변수로 정렬 방식을 지정
        Set<String> set = new TreeSet<>(new MyCompare());
        set.add("aaa");
        set.add("ccc");
        set.add("bbb");

        System.out.println(set);
    }
//    TreeSet 클래스를 생성할 때 생성자에 매개변수를 넣지 않으면 원래 String 클래스에 정의된 Comparable 인터페이스의 compareTo() 메서드 구현 내용으로 오름차순으로 정렬된다.
//    이 예제에서는 TreeSet 클래스 생성자에 Comparator 인터페이스를 구현한 MyCompare 인스턴스를 매개변수로 넣었기 때문에, 재정의한 compare() 메서드 방식에 따라 내림차순으로 정렬된 방식이 바뀐다.
}
