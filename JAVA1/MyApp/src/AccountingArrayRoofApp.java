public class AccountingArrayRoofApp {
    public static void main(String[] args) {

        double ValueOfSupply = 53000.0;
        double VATRate = 0.1;
        double ExpenseRate = 0.3;
        double VAT = ValueOfSupply * VATRate;
        double Total = ValueOfSupply + VAT;
        double Expense = ValueOfSupply * ExpenseRate;
        double Income = ValueOfSupply - Expense;


        System.out.println("Value of supply : "+ ValueOfSupply); // 공급가 (10000.0)
        System.out.println("VAT : "+ VAT); // 부가가치세 (1000.0)
        System.out.println("Total : "+ Total); // 부가가치세와 공급가의 합계
        System.out.println("Expense : "+ Expense); // 비용을 뺀 금액 : 30%로 임의 설정
        System.out.println("Income : "+ Income); // 순수익

        double[] dividendRates = new double[3]; // double 형의 데이터를 3개를 담을 수 있다. 배열
        dividendRates[0] = 0.5;
        dividendRates[1] = 0.3;
        dividendRates[2] = 0.2;

        double dividend1 = Income * dividendRates[0];
        double dividend2 = Income * dividendRates[1];
        double dividend3 = Income * dividendRates[2];

        //while 은 반복문에서 사용 중괄호 안에 써있는 코드가 반복해서 실행
        int i = 0; // 반복될 때 마다 i라는 변수에 기록해서 반복될 때 마다 i의 값이 커진다.
        while (i < dividendRates.length) {
            System.out.println("Dividend : "+(Income * dividendRates[i]) );
            i = i + 1;
        }
    }
}
