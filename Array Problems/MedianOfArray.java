import java.util.Arrays;

public class MedianOfArray {

    public static double median(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;

        if (n % 2 == 1) {
            return arr[n / 2];
        } else {
            return (arr[n / 2 - 1] + arr[n / 2]) / 2.0;
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 7};
        System.out.println("Median = " + median(arr));
    }
}
