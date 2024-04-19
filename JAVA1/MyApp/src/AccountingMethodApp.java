public class AccountingMethodApp {
    public static double ValueOfSupply; // main 바깥쪽에서 선언되었기 때문에 main에서도, getvat 안에서도 적용 가능.
    private static double vatRate;
    public static double ExpenseRate;

    public static void main(String[] args) {
        ValueOfSupply = 23000.0;
        vatRate = 0.1; // 전역변수 필드 선언
        ExpenseRate = 0.3;

        Print();
    }

    private static void Print() {
        System.out.println("Value of supply : "+ ValueOfSupply); // 공급가 (10000.0)
        System.out.println("VAT : "+ getVat()); // 부가가치세 (1000.0)
        System.out.println("Total : "+ getTotal()); // 부가가치세와 공급가의 합계
        System.out.println("Expense : "+ getExpense()); // 비용을 뺀 금액 : 30%로 임의 설정
        System.out.println("Income : "+ getIncome()); // 순수익
        System.out.println("Dividend 1 : "+ getDividend1()); // 첫번째 사람이 가져갈 배당 5
        System.out.println("Dividend 2 : "+ getDividend2()); // 두번째 사람이 가져갈 배당 3
        System.out.println("Dividend 3 : "+ getDividend3()); // 세번째 사람이 가져갈 배당 2
    }

    private static double getDividend1() {
        return getIncome() * 0.5;
    }
    private static double getDividend2() {
        return getIncome() * 0.3;
    }
    private static double getDividend3() {
        return getIncome() * 0.2;
    }

    private static double getIncome() {
        return ValueOfSupply + getExpense();
    }

    private static double getExpense() {
        return ValueOfSupply * ExpenseRate;
    }

    private static double getTotal() {
        return ValueOfSupply + getVat();
    }

    private static double getVat() {
        return ValueOfSupply * vatRate; // Method를 만드는 코드
    }
}
