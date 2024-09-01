public class TaxReport {
    private TaxCalculator2023 calculator;

    public TaxReport(TaxCalculator2023 calculator) {
        calculator = new TaxCalculator2023(100_000);
    }

    public void show() {
        var tax = calculator.calculateTax();
        System.out.println(tax);
    }
}
