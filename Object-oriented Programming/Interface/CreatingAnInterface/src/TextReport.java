public class TextReport {
    private TaxCalculator2023 calculator;

    public TextReport() {
        calculator = new TaxCalculator2023(100_000);
    }

    public String getReport() {
        return "The tax is " + calculator.calculateTax();
    }
}
