public class IfApp {
    public static void main(String[] args) {

        System.out.println("a");
    /*    if (false) {//Boolean 만이 값이 될 수 있다.(true of false)
            System.out.println(1);
        } else {
            if (true) {
                System.out.println(2);
            }
            else {
                System.out.println(3);
            }
        }*/
        if (false){
            System.out.println(1);
            }else if (true) {
                System.out.println(2);
            } else {
                System.out.println(3);
                }

        System.out.println("b");
    }
}
// true 일 경우 실행 false 일 경우 실행되지 않는 코드로 만듬

// else 로 연결 가능

// 조건문 안에는 또 다른 조건문이 들어갈 수 있다.