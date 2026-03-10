import java.util.*;

public class Main {
    public static void main(String[] args) {

        String str = "the quick brown fox jumps over the lazy dog";
        str = str.toLowerCase();

        HashSet<Character> set = new HashSet<>();

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);

            if(ch >= 'a' && ch <= 'z'){
                set.add(ch);
            }
        }

        if(set.size() == 26){
            System.out.println("Pangram");
        } else {
            System.out.println("Not Pangram");
        }
    }
}
