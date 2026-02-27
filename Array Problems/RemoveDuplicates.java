import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 20, 40, 10, 50, 30};
        HashSet<Integer> hs = new HashSet<>();
        for (int i=0;i<arr.length-1;i++) {
            hs.add(arr[i]);
        }
        System.out.println(hs);
    }
}
