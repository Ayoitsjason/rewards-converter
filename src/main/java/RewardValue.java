public class RewardValue {
    private double cash_value;
    private double miles_value;
    private static final double MILES_TO_CASH_RATE = .0035;

    public RewardValue() {
        this.cash_value = 0;
        this.miles_value = 0;
    }
    public RewardValue(double cash) {
        this.cash_value = cash;
        this.miles_value = cash * MILES_TO_CASH_RATE;
    }

    public double getCashValue() {
        return this.cash_value;
    }

    public double getMilesValue() {
        return this.miles_value;
    }



}
