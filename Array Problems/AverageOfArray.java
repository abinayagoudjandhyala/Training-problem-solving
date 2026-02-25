public class AverageOfArray {

    public static int average(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return sum / arr.length;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30};
        System.out.println("Average = " + average(arr));
    }
}
