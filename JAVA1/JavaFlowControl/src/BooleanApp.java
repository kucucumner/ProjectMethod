public class BooleanApp {
    public static void main(String[] args) {

        System.out.println("one"); // 문자열 (String)
        System.out.println(1); // 숫자(int)
        System.out.println(true); // Boolean 타입 1
        System.out.println(false); // Boolean 타입 2

        String foo = "Hello World";
        //String true = "Hello World"; Boolean 이기 때문에 변수의 이름으로 사용이 불가능하다. (reserved word)

        System.out.println(foo.contains("World")); // true
        System.out.println(foo.contains("KU")); // false
        // 즉 참 거짓이다 라고 하는 정보를 표현할 때 사용하는 데이터 타입이 true, false 라는 구체적 데이터 두가지로 이루어져 있는 Boolean 이라고 한다.
    }
}
