public class LogicalOperatorApp {
    public static void main(String[] args) {
        // AND 연산자 (2개가 모두 true 일 경우 그 값은 true 그 외에는 false 를 출력한다.)
        System.out.println(1 == 1); // true
        System.out.println(true && true); // ture 즉 && 의 연산자는 왼쪽 오른쪽이 true 면 이 값을 true 로 바꿔줌
        System.out.println(true && false); // false
        System.out.println(false && true); // false
        System.out.println(false && false); // false

        // OR 연산자 (2개 중 하나라도 true 라면 그 값은 true 가 된다.)
        System.out.println(true || true); // true
        System.out.println(true || false); // true
        System.out.println(false || true); // true
        System.out.println(false || false); // false

        // NOT 연산자
        System.out.println(!true); // false
        System.out.println(!false); // true
    }
}
