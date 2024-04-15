public class Casting {
    public static void main(String[] args) {

        double a = 1.1;
        double b = 1; // 1.0
        System.out.println(b); // 정수지만 변수가 double 이기 때문에 자동으로 1이 double 즉 실수로 컨버팅 된다. 잃어버리는 값은 존재X

        // int c = 1.1;
        double d = 1.1;
        int e = (int) 1.1; // 실수를 강제로 int의 형태로 바꾸는 코드
        System.out.println(e); // 1.1을 강제로 정수로 바꾸되어서 손실이 발생한다.
        // 따라서 double b = 1; 을 명시적으로 표현한다면 double b2 = (double) 1; 이다.

        String f = Integer.toString(1);
        System.out.println(f.getClass()); // 결과는 1이 나왔지만 데이터 타입은 문자열로 바뀌었다. (class java.lang.String)

    }
}
