public class HarshadNumber {

    static boolean isHarshad(int num) {
        int sum = 0;
        int original = num;

        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }

        return original % sum == 0;
    }

    public static void main(String[] args) {
        int num = 18;
        System.out.println(isHarshad(num));
    }
}
