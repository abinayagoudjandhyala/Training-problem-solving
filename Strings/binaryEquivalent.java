import java.util.*;

public class BinaryEquivalent {

    public static String binaryEquivalent(int num) {

        String bin = "";

        while (num > 0) {
            int r = num % 2;
            bin = r + bin;
            num = num / 2;
        }

        return bin;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();   // number of inputs

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();

            System.out.println(binaryEquivalent(num));
        }
    }
}
