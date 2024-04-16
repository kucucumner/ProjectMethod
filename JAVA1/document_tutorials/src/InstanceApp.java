import java.io.FileNotFoundException;
import java.io.PrintWriter;
// Instance 는 여러개의 파일을 작업할 때 사용하면 편하게 작업이 가능하다.
public class InstanceApp {
    public static void main(String[] args) throws FileNotFoundException {

       PrintWriter p1 = new PrintWriter("result1.txt");
       p1.write("Hello 1");
       p1.close();

       PrintWriter p2 = new PrintWriter("result2.txt");
       p2.write("Hello 2");
       p2.close();
    }
}
