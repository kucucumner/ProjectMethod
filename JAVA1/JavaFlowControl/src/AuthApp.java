public class AuthApp {
    public static void main(String[] args) {

        String id = "KUKYOHYUN";
        String inputId = args[0]; // 매개변수 설정

        String pass = "1111";
        String inputPass = args[1];

        System.out.println("Hi.");

        //if (inputId == id) {
/*        if (inputId.equals(id)) {
            if (inputPass.equals(pass)) {
                System.out.println("Master");
            }else {
                System.out.println("Wrong Password");// inputId 값과 id 값이 같다면 참이 되고 아니면 거짓
            }
        }else {
                System.out.println("Who are you");
            }*/
        if (inputId.equals(id) && inputPass.equals(pass) ) { // && = 논리 연산자
                System.out.println("Master");

        }else {
            System.out.println("Who are you");
        }
        }
    }
