public class ArrayApp {
    public static void main(String[] args) {


        // KU, KIM, PARK
        // String users = "KU, KIM, PARK;

        //배열 사용
        String[] users = new String[3];
        users[0] = "KU";
        users[1] = "KIM";
        users[2] = "PARK";

        System.out.println(users[1]); // KIM
        System.out.println(users.length); // 3 3칸짜리 배열이라는 뜻

        int[] scores = {10, 100, 100};
        System.out.println(scores[1]);
        System.out.println(scores.length);
    }
}
