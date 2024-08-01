package Company_Asked_problems;

public class Accenture_makeLowerOrUpperCase {
    public static void main(String[] args) {
        System.out.println(makeCase("AbCdEfG"));

    }
    public static String makeCase(String str){
        if(str.length() == 0){
            return "";
        }
        String str1=str.toUpperCase();
        int countUC=0;
        int countLC=0;
        for(int i=0 ; i<str.length();i++){
            if(str.charAt(i) == str1.charAt(i)){
                countUC++;
            }
            else {
                countLC++;
            }
        }
        if(countUC>=countLC){
            return str1;
        }
        return str.toLowerCase();



        }
}

