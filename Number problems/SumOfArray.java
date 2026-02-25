public class SumOfArray {

    public static int findSum(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {10, 45, 2, 99, 23};
        System.out.println("Sum = " + findSum(arr));
    }
}