public class LoopArray {
    public static void main(String[] args) {
                /*
        <li>KU</li>
        <li>KIM</li>
        <li>PARK</li>
         */

        String[] users = new String[3];
        users[0] = "KU";
        users[1] = "KIM";
        users[2] = "PARK";
        
        for (int i = 0; i < 3; i++) {
            System.out.println("<li>"+users[i]+"</li>");
        }
    }
}
