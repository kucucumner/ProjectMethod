public class AccountingIFApp {
    public static void main(String[] args) {

        double ValueOfSupply = 20000.0; // ValueOfSupply의 값을 변경
        double VATRate = 0.1;
        double ExpenseRate = 0.3;
        double VAT = ValueOfSupply * VATRate;
        double Total = ValueOfSupply + VAT;
        double Expense = Total * ExpenseRate; // 올바른 Expense 계산
        double Income = Total - Expense; // 올바른 Income 계산
        double dividend1 = Income * 0.5;
        double dividend2 = Income * 0.3;
        double dividend3 = Income * 0.2;


        System.out.println("Value of supply : "+ ValueOfSupply);
        System.out.println("VAT : "+ VAT);
        System.out.println("Total : "+ Total);
        System.out.println("Expense : "+ Expense);
        System.out.println("Income : "+ Income);
        System.out.println("Dividend 1 : "+dividend1);
        System.out.println("Dividend 2 : "+dividend2);
        System.out.println("Dividend 3 : "+dividend3);
    }
}
