import java.util.*;

public class Main {

    public static String oddEvenIndex(String str) {

        String odd = "";
        String even = "";

        for(int i = 0; i < str.length(); i++) {

            if(i % 2 != 0) {
                odd += str.charAt(i);
            }
            else {
                even += str.charAt(i);
            }
        }

        return odd + even;
    }

    public static void main(String[] args) {

        String str = "de5tzq";

        System.out.println(oddEvenIndex(str));
    }
}
