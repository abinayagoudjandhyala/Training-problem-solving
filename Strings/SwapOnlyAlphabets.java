
public class Main{
    public static void main(String args[]){
         String str = "1234abinaya3456";
        char[] arr = str.toCharArray();
        int left=0;
        int right = arr.length-1;
        while(left < right){
            if(!Character.isLetter(arr[left])){
                left++;
            }else if(!Character.isLetter(arr[right])){
                right--;
            }else{
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        System.out.println(arr);
    }
}
