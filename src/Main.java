public class Main {
    public static void main(String[] args) {
        double initialBalance = 5000;
        double annualInterestRate = 0.17;
        double monthlyInterestRate = annualInterestRate / 12;
        double interestOneMonth = initialBalance * monthlyInterestRate;
        double balanceAfterOneMonth = initialBalance + interestOneMonth;
        double interestTwoMonths = balanceAfterOneMonth * monthlyInterestRate;
        double balanceAfterTwoMonths = balanceAfterOneMonth + interestTwoMonths;

        System.out.println("Initial credit card balance: $" + initialBalance);
        System.out.println("Interest due after one month: $" + interestOneMonth);
        System.out.println("Balance after one month: $" + balanceAfterOneMonth);
        System.out.println("Interest due after two months: $" + interestTwoMonths);
        System.out.println("Balance after two months: $" + balanceAfterTwoMonths);
    }
}
