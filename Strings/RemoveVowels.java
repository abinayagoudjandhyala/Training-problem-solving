import java.util.*;

public class Main {
    public static void main(String[] args) {

        String str = "abinaya";
        List<Character> vowels = Arrays.asList('a','e','i','o','u');

        String result = "";

        for(char ch : str.toCharArray()) {
            if(!vowels.contains(Character.toLowerCase(ch))) {
                result += ch;
            }
        }

        System.out.println(result);
    }
}
