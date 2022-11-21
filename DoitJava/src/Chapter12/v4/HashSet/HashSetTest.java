package Chapter12.v4.HashSet;

import java.util.HashSet;

public class HashSetTest {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add(new String("임정순"));
        hashSet.add(new String("박현정"));
        hashSet.add(new String("홍연의"));
        hashSet.add(new String("강감찬"));
        hashSet.add(new String("강감찬"));

        System.out.println(hashSet);

//        [홍연의, 박현정, 강감찬, 임정순]
//        두 번 추가 되지 않음.
    }
}
