public class RewardValue {

  private final double cashValue;
  public static final double MILES_TO_CASH_CONVERSION_RATE = 0.0035;

  // Constructor that accepts cash value
  public RewardValue(double cashValue) {
    this.cashValue = cashValue;
  }

  // Constructor that accepts miles value
  public RewardValue(int milesValue) {
    this.cashValue = convertToCash(milesValue);
  }

  // Method that returns miles value
  private static int convertToMiles(double cashValue) {
    return (int) (cashValue / MILES_TO_CASH_CONVERSION_RATE);
  }

  // Method that returns cash value
  private static int convertToCash(int milesValue) {
    return milesValue * MILES_TO_CASH_CONVERSION_RATE;
  }

  public double getCashValue() {
    return cashValue;
  }

  public int getMilesValue() {
    return convertToMiles(this.cashValue);
  }
}
