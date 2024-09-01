import java.text.NumberFormat;

public class MortgageReport {
    private final NumberFormat currency;
    private final MortgageCalculator calculator;

    public MortgageReport(MortgageCalculator calculator) {
        this.calculator = calculator; // set the calculator
        currency = NumberFormat.getCurrencyInstance(); // set the currency
    }

    public void printPaymentSchedule() {
        System.out.println();
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("----------------");

        for (double balance : calculator.getRemainingBalances()) // for each balance
            System.out.println(currency.format(balance)); // print the balance
    }

    public void printMortgage() {
        double mortgage = calculator.calculateMortgage(); // calculate the mortgage
        String mortgageFormatted = currency.format(mortgage); // format the mortgage
        System.out.println("MORTGAGE");
        System.out.println("--------");
        System.out.println("Monthly Payments: " + mortgageFormatted);
    }
}
