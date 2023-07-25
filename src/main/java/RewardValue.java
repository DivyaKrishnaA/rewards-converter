
public class RewardValue extends RewardsConverter {

  static double cashValue;
  int milesValue;

  // Constructor that accepts cash value
  public RewardValue(double cashValue) {
    RewardValue.cashValue = cashValue;
  }

  // Constructor that accepts miles value
  public RewardValue(int milesValue) {
    this.milesValue = milesValue;
  }

  // Method that returns cash value
  static double getCashValue() {
    return RewardValue.cashValue;
  }

  // Method that returns miles value
  static double getMilesValue() {
    return (getCashValue() * (10000.0 / 35.0));
  }

  public static void main(String[] args) {
    getCashValue();
    getMilesValue();
  }
}
