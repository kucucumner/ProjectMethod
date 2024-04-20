public class AccountingApp {
    // 공급가액
    public static double valueOfSupply = 10000.0;
    // 부가가치세율
    public static double vatRate = 0.1;
    // getVAT 가 return 값이 double 이라는것을 알려줌
    public static double getVAT(){
        return valueOfSupply * vatRate;
    }

    public static double getTotal(){
        return valueOfSupply + getVAT();
    }
    public static void main(String[] args) {
        // 메소드는 어떤 로직에 이름을 붙인거기 때문에 지금 이 코드에서는 굳이 변수를 정의할 필요가 없다.


        System.out.println("Value Of Supply :" + valueOfSupply);
        System.out.println("Vat :" + getVAT());
        System.out.println("Total :" + getTotal());
    }
}
