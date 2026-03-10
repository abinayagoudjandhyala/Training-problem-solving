import java.util.*;

public class Main {
    public static void main(String[] args) {

        String s="egg";
        String t="add";

        HashMap<Character,Character> map=new HashMap<>();

        for(int i=0;i<s.length();i++){

            char a=s.charAt(i);
            char b=t.charAt(i);

            if(map.containsKey(a) && map.get(a)!=b){
                System.out.println(false);
                return;
            }

            map.put(a,b);
        }

        System.out.println(true);
    }
}
