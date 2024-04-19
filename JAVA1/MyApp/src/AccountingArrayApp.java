public class AccountingArrayApp {
    public static void main(String[] args) {

        double ValueOfSupply = 53000.0;
        double VATRate = 0.1;
        double ExpenseRate = 0.3;
        double VAT = ValueOfSupply * VATRate;
        double Total = ValueOfSupply + VAT;
        double Expense = ValueOfSupply * ExpenseRate;
        double Income = ValueOfSupply - Expense;


        double[] dividendRates = new double[3]; // double 형의 데이터를 3개를 담을 수 있다. 배열
        dividendRates[0] = 0.5;
        dividendRates[1] = 0.3;
        dividendRates[2] = 0.2;

        double dividend1 = Income * dividendRates[0];
        double dividend2 = Income * dividendRates[1];
        double dividend3 = Income * dividendRates[2];

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
