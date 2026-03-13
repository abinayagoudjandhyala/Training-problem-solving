
import java.util.*;
public class Main {
    public static void main(String[] args) {
        String str = "abinaya";
        List<Character> vowels = Arrays.asList('a','e','i','o','u');
        String result = "";
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(vowels.contains(Character.toLowerCase(ch))) {
                result += "*";
            } else {
                result += ch;
            }
        }
        System.out.println(result);
    }
}
