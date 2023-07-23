public class RewardValue {
    private final double cashValue;
    public static final double MILES_TO_CASH_RATE = 0.0035;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    public RewardValue(int milesValue) {
        this.cashValue = convertToCash(milesValue);
    }

    private int convertToMiles(double cashValue) {
        return (int) (cashValue / MILES_TO_CASH_RATE);
    }
    private double convertToCash(int milesValue) {
        return milesValue * MILES_TO_CASH_RATE;
    }
    public double getCashValue() {
        return this.cashValue;
    }

    public int getMilesValue() {
        return convertToMiles(this.cashValue);
    }



}
