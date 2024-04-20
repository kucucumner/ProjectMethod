class print {
    public String delimiter;

    // 성격이 비슷한 메소드를 정리
    public void a() {
        System.out.println(this.delimiter);
        System.out.println("a");
        System.out.println("a");
    }

    public void b() {
        System.out.println(this.delimiter);
        System.out.println("b");
        System.out.println("b");
    }

    public static void c(String delimiter) {
        System.out.println(delimiter);
        System.out.println("b");
        System.out.println("b");
    }
}
    public class StaticMethod {

        public static void main(String[] args) {

            //print.a("-");
            //print.b("-");
            // new = 복제
            print t1 = new print();
            t1.delimiter = "-";
            t1.a();
            t1.b();
            print.c("%");
            // t1, t2 = instance
            print t2 = new print();
            t2.delimiter = "*";
            t2.a();
            t2.b();
        }

    }
// 메소드가 클래스의 소속일 때 static 이 있어야 한다.
// static 이 없으면 instance