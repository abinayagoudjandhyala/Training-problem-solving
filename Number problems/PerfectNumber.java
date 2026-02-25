public class PerfectNumber {

    static boolean isPerfect(int num) {
        int sum = 0;

        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        return sum == num;
    }

    public static void main(String[] args) {
        int num = 6;
        System.out.println(isPerfect(num));
    }
}
