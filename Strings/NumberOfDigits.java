
class Main {
    public static void main(String[] args) {
        String str ="abc123def456";
        int count =0;
        for(int i=0;i<str.length();i++){
            if(Character.isDigit(str.charAt(i))){
                count++;
            }
        }
        System.out.println(count);
        
    }
}
