public class AccessLevelModifierMethod {
    // public. protected, default, private 라는것도 다 올 수 있다.
    public static void hi(){
        System.out.println("Hi");
    }
    public static void main(String[] args) {
        hi();
    }
}
// private 는 같은 클래스 안에서만 사용 가능하다.
// static = class method