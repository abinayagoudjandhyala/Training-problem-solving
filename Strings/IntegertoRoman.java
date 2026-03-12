public class Main {
    public static void main(String[] args) {

        int n = 97;

        int[] num = {100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] roman = {"C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        String result = "";

        for (int i = 0; i < num.length; i++) {
            while (n >= num[i]) {
                result = result + roman[i];
                n = n - num[i];
            }
        }

        System.out.println(result);
    }
}
