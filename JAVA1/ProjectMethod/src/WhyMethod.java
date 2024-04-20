import java.io.FileWriter;
import java.io.IOException;

public class WhyMethod {
    public static void main(String[] args) throws IOException {
        // [] = 서로 연관된 문자열을 그룹핑하는 문자열 배열
        // args = 메인이라는 메소드를 자바가 실행할 때 입력해주는 입력 값이 args 통해서 들어온다.
                        // a 라는 문자열을 '인자' 라고 하며 영어로 'argument' 라 한다.
        printTwoTimes("a", "-");
        System.out.println(TwoTimes("a","-"));
        writeFileTwoTimes("a", "*");
        FileWriter fw = new FileWriter("out.txt");
        fw.write(TwoTimes("a", "*"));
        fw.close();
        printTwoTimes("a", "&");
        //Email.send("KU@a.com" , "Two Times a", TwoTimes("a","&"));


    }
    public static String TwoTimes(String text, String delimiter){
        String out = "";
        out = out + delimiter + "\n";
        out = out + text + "\n";
        out = out + text + "\n";
        return out;
    }
    // printTwoTimes 라는 메소드를 정의하고 메소드 안에 있는 첫번째 값은 반드시 String 이고 그렇게 들어오는 값은 text 라는 이름의 변수의 값
                                    // text, delimiter 를 매게변수 하며 영어로 parameter 라 한다.
    public static void  printTwoTimes(String text , String delimiter) {
        System.out.println(delimiter);
        System.out.println(text);
        System.out.println(text);
    }
    public static void writeFileTwoTimes(String text, String delimiter) throws IOException{
        FileWriter fw = new FileWriter("output,txt");
        fw.write(delimiter + "\n");
        fw.write(text + "\n");
        fw.write(text + "\n");
        fw.close();
    }
}
