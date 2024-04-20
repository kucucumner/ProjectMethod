import java.io.FileWriter;
import java.io.IOException;

public class WhyMethod2 {
    public static void main(String[] args) throws IOException {

        System.out.println(TwoTimes("a","-"));
        FileWriter fw = new FileWriter("out.txt");
        fw.write(TwoTimes("a", "*"));
        fw.close();
        //Email.send("KU@a.com" , "Two Times a", TwoTimes("a","&"));


    }
    public static String TwoTimes(String text, String delimiter){
        String out = "";
        out = out + delimiter + "\n";
        out = out + text + "\n";
        out = out + text + "\n";
        return out;
    }

}
