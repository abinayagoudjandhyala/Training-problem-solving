public class ArmstrongNumber {

    static boolean isArmstrong(int num) {
        int original = num;
        int sum = 0;
        int count = 0;

        int temp = num;

        // Count digits
        while (temp > 0) {
            count++;
            temp /= 10;
        }

        temp = num;

        // Calculate power sum
        while (temp > 0) {
            int digit = temp % 10;
            sum += (int) Math.pow(digit, count);
            temp /= 10;
        }

        return sum == original;
    }

    public static void main(String[] args) {
        int num = 153;
        System.out.println(isArmstrong(num));
    }
}
