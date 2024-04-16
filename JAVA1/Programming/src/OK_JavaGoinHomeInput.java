import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security;
import org.opentutorials.iot.DimmingLights;
import javax.swing.*; // 이 코드에 의해서 자바가 swing 이라는 기술에 openoptionpain 이라는 기능에 show input 다이얼로그를 켜주면 안내 박스가 나온다.

public class OK_JavaGoinHomeInput {
    private static javax.swing.JOptionPane JOptionPane;

    public static void main(String[] args) {

        String id = JOptionPane.showInputDialog("Enter a ID"); // 사용자가 입력한 값에 따라서 다른 동작을 해주는 기능
        String bright = JOptionPane.showInputDialog("Enter a Bright level");

        // Elevator call
        Elevator myElevator = new Elevator(id);
        myElevator.callForUp(1);
        // Security off
        Security mySecurity = new Security(id);
        mySecurity.off();
        // Light on
        Lighting hallLamp = new Lighting(id);
        hallLamp.on();

        Lighting floorLamp = new Lighting(id);
        floorLamp.on();

        DimmingLights moodLamp = new DimmingLights(id+ " moodLamp");
        moodLamp.setBright(Double.parseDouble(bright)); // String 타입의 bright가 double 형으로 바뀜.
        moodLamp.on();

    }
}
