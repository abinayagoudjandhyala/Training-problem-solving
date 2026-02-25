public class LargestElement {

    public static int largest(int[] arr) {
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {10, 45, 2, 99, 23};
        System.out.println("Largest = " + largest(arr));
    }
}
