package Chapter07;

public class ArrayTest2 {
    public static void main(String[] args) {
        double[] data = new double[5];

        data[0] = 10.0;
        data[1] = 20.0;
        data[2] = 30.0;

        for(int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }
//      정수 배열과 실수 배열을 별도로 초기화하지않고 선언하면 배열의 요소 값은 0으로 초기화된다.

    }
}
