public class Main {
    public static void main(String[] args) {
        var report = new TaxReport(new TaxCalculator2024(100_000));
        report.show();
    }

    public void doSomething(TaxCalculator calculator) {
        calculator.calculateTax();
    }
}