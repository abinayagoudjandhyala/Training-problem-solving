import java.util.Arrays;

public class RearrangePositiveNegative {

    public static int[] rearrange(int[] arr) {
        int[] ans = new int[arr.length];
        int index = 0;

        for (int num : arr)
            if (num >= 0) ans[index++] = num;

        for (int num : arr)
            if (num < 0) ans[index++] = num;

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {5, -3, 0, 7, -1, 9};
        System.out.println(Arrays.toString(rearrange(arr)));
    }
}
