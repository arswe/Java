public class Main {
    public static void main(String[] args) {
        // Logical Operators

        int temperture = 22;
        boolean isWarm = temperture > 20 && temperture < 30;
        System.out.println(isWarm);

        boolean hasHighIncome = true;
        boolean hasGoodCredit = true;
        boolean hasCriminalRecord = false;

        boolean isEligible = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord;

        System.out.println(isEligible);


    }
}