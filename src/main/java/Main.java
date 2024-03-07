public class Main {
    public static void main(String[] args) {
        // Creating an instance of RewardValue with cash value
        RewardValue rewardValue1 = new RewardValue(100.0);
        System.out.println("Cash value: $" + rewardValue1.getCashValue());
        System.out.println("Miles value: " + rewardValue1.getMilesValue());

        // Creating an instance of RewardValue with miles value
        RewardValue rewardValue2 = new RewardValue(500);
        System.out.println("\nMiles value: " + rewardValue2.getMilesValue());
        System.out.println("Cash value: $" + rewardValue2.getCashValue());
    }
}
