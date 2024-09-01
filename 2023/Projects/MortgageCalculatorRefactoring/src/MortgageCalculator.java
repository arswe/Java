public class MortgageCalculator {
    private final static byte MONTHS_IN_YEAR = 12;
    private final static byte PERCENT = 100;
    private int principal;
    private float annualInterest;
    private byte years;

    public MortgageCalculator(int principal, float annualInterest, byte years) {
        this.principal = principal;
        this.annualInterest = annualInterest;
        this.years = years;
    }

    public double calculateBalance(short numberOfPaymentsMade) {
        float monthlyInterest = getMonthlyInterest(); // monthly interest rate (APR / 12)
        short numberOfPayments = getNumberOfPayments(); // number of payments (years * 12)
        double balance = principal
                * (Math.pow(1 + monthlyInterest, numberOfPayments) - Math.pow(1 + monthlyInterest, numberOfPaymentsMade))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1); // mortgage formula

        return balance; // return the balance
    }


    public double calculateMortgage() {
        float monthlyInterest = getMonthlyInterest(); // monthly interest rate (APR / 12)
        short numberOfPayments = getNumberOfPayments(); // number of payments (years * 12)
        double mortgage = principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1); // mortgage formula

        return mortgage; // return the mortgage
    }

    public double[] getRemainingBalances() {
        double[] balances = new double[getNumberOfPayments()]; // number of payments (years * 12)
        for (short month = 1; month <= balances.length; month++) // for each month
            balances[month - 1] = calculateBalance(month); // calculate the balance
        return balances; // return the array of balances
    }

    private float getMonthlyInterest() {
        return annualInterest / PERCENT / MONTHS_IN_YEAR; // monthly interest rate (APR / 12)
    }

    private short getNumberOfPayments() {
        return (short) (years * MONTHS_IN_YEAR); // number of payments (years * 12)
    }
}
