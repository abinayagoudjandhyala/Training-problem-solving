public class Main {
    public static void main(String[] args) {

        String password = "Abcdef123";

        boolean lower = false;
        boolean upper = false;
        boolean digit = false;

        if(password.length() > 8 && password.length() < 12){

            for(int i = 0; i < password.length(); i++){
                char ch = password.charAt(i);

                if(Character.isLowerCase(ch)){
                    lower = true;
                }
                else if(Character.isUpperCase(ch)){
                    upper = true;
                }
                else if(Character.isDigit(ch)){
                    digit = true;
                }
            }

            if(lower && upper && digit){
                System.out.println("Valid Password");
            } else {
                System.out.println("Invalid Password");
            }

        } else {
            System.out.println("Password length must be between 6 and 12");
        }
    }
}
