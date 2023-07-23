import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {
    public static final double MILES_TO_CASH_RATE = 0.0035;
    @Test
    void create_with_cash_value() {
        double cashValue = 100;
        var rewardValue = new RewardValue(cashValue);
        assertEquals(cashValue, rewardValue.getCashValue());
    }

    @Test
    void create_with_miles_value() {
        int milesValue = 10000;
        var rewardValue = new RewardValue(milesValue);
        assertEquals(milesValue, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_cash_to_miles() {
        int milesTarget = 142857;
        var rewardValue = new RewardValue(500.00);
        assertEquals(milesTarget, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_miles_to_cash() {
        double cashTarget = 499.9995;
        var rewardValue = new RewardValue(142857);
        assertEquals(cashTarget, rewardValue.getCashValue());
    }
}
