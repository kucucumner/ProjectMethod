public class AuthApp3 {
    public static void main(String[] args) {

        //String [] users = {"KU", "KIM", "PARK"}; // 유저의 수
        String[][] users ={
                {"KU", "1111"},
                {"KIM", "2222"},
                {"PARK","3333"}

        };
        String inputID = args[0];
        String inputPASS = args[1];

        boolean isLogined = false; // 로그인이 됐는지 안됐는지 확인 안됐다면 false
        // 유저의 목록 확인
        for (int i = 0; i < users.length; i++) {
            String[] current = users[i];
            // 만약, current[0] 와 current[1]  두개가 같다면 참 (반복문)
            if(
                    current[0].equals(inputID) && current[1].equals(inputPASS)
            ) {
                isLogined = true; // 플래그 변수 로그인이 됐다면 true 로 종료
                // 일치하는 사람이 있다면 반복문 종료
                break;
            }
        }
        System.out.println("Hi,");
        if (isLogined) {
            System.out.println("Master");
        } else {
            System.out.println("Who are you?");
        }

    }
}
