public class OutputMethod {

    public static String a(){
        // 이 실행이 끝날 때 return 이라는것을 설정하면 a 라는 메소드는 return 뒤에 있는 값이 된다.(erer)
        return "erer";
    }
    // return 뒤에 있는 값이 실행 결과가 된다. return 값은 그 메소드를 종료 시키는 역할도 한다.
    public static int one(){
        return 1;
    }
                // void 는 return 값이 없다.
    public static void main(String[] args) {

        System.out.println(a());
        System.out.println(one());
    }
}
