public class AccountingIF10000App {
    public static void main(String[] args) {

        double ValueOfSupply = 5000.0;
        double VATRate = 0.1;
        double ExpenseRate = 0.3;
        double VAT = ValueOfSupply * VATRate;
        double Total = ValueOfSupply + VAT;
        double Expense = ValueOfSupply * ExpenseRate;
        double Income = ValueOfSupply - Expense;

        double dividend1;
        double dividend2;
        double dividend3;

        if (Income > 10000.0) {
            dividend1 = Income * 0.5;
            dividend2 = Income * 0.3;
            dividend3 = Income * 0.2;
        } else {
            dividend1 = Income * 1.0;
            dividend2 = Income * 0;
            dividend3 = Income * 0;
        }


        System.out.println("Value of supply : "+ ValueOfSupply); // 공급가 (10000.0)
        System.out.println("VAT : "+ VAT); // 부가가치세 (1000.0)
        System.out.println("Total : "+ Total); // 부가가치세와 공급가의 합계
        System.out.println("Expense : "+ Expense); // 비용을 뺀 금액 : 30%로 임의 설정
        System.out.println("Income : "+ Income); // 순수익
        System.out.println("Dividend 1 : "+dividend1); // 첫번째 사람이 가져갈 배당 5
        System.out.println("Dividend 2 : "+dividend2); // 두번째 사람이 가져갈 배당 3
        System.out.println("Dividend 3 : "+dividend3); // 세번째 사람이 가져갈 배당 2
    }
}
