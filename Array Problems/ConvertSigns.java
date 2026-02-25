import java.util.Arrays;

public class ConvertSigns {

    public static int[] convert(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) arr[i] = 1;
            else if (arr[i] < 0) arr[i] = -1;
            else arr[i] = 0;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {5, -3, 0, 7, -1};
        System.out.println(Arrays.toString(convert(arr)));
    }
}
