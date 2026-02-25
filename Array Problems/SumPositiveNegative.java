public class SumPositiveNegative {

    public static int[] findSum(int[] arr) {
        int positive = 0;
        int negative = 0;

        for (int num : arr) {
            if (num >= 0) positive += num;
            else negative += num;
        }

        return new int[]{positive, negative};
    }

    public static void main(String[] args) {
        int[] arr = {5, -3, 0, 7, -1};
        int[] ans = findSum(arr);

        System.out.println("Positive Sum = " + ans[0]);
        System.out.println("Negative Sum = " + ans[1]);
    }
}
