package Company_Asked_problems;

public class Accenture_moveHyphen {
    public static void main(String[] args) {
        String Test1="Soyeb-Ali-Faruque";
        System.out.println(compareSubString(Test1));

    }
    public static String compareSubString(String str){
        String hyphens_str="";
        String characters_str="";
        for(int i=0;i<str.length();i++) {
            if (str.charAt(i) == '-') {
                hyphens_str += String.valueOf(str.charAt(i));

            } else {
                characters_str += String.valueOf(str.charAt(i));
            }
        }
        String result=hyphens_str.concat(characters_str);
        return result;
    }
}
