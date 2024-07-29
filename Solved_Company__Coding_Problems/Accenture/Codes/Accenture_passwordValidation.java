package Company_Asked_problems;

public class Accenture_passwordValidation {

    public static void main(String[] args) {
        System.out.println(checkPassword("skd_hA4"));

    }
    public static int checkPassword(String password){
        //check atleast 4 character should be there
        //And password should not start with number
        if(password.length() < 4){
            return 0;
        }
        int firstLetter=password.charAt(0)-'0';
        if(firstLetter<=9){
            return 0;
        }
        boolean isCapital=false;
        boolean isNumeric=false;
        String str=password.toLowerCase();
        for(int i=0;i<password.length();i++){
            //if we found any extra space then return 0
            if(password.charAt(i) == ' '){
                return 0;
            }
            if(password.charAt(i) == str.charAt(i)){
                isCapital=true;
            }
            if((password.charAt(i)-'0') <=9){
                isNumeric=true;
            }
        }
        if(isCapital && isNumeric){
            return 1;
        }
        return 0;
    }

}
