package Company_Asked_problems;

import com.sun.jdi.Value;

public class Accenture_minimumCostOfConvertingConsonantToVowerChars {
    public static void main(String[] args) {
        System.out.println(constToVow("aaaaaa"));

    }
    public static int constToVow(String str){
        int ans=0;
        for(int i=0;i<str.length();i++){
            if(isVowel(str.charAt(i))==false){
                int chValue=closestVowel(str.charAt(i));
                ans+=chValue;
            }
        }
        return ans;
    }
    static boolean isVowel(char ch){
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            return true;
        }

        return false;
    }
    static int closestVowel(char ch){
        int small=Integer.MAX_VALUE;
        char[] vowels={'a','e','i','o','u'};
        int chValue=(int)ch;
        for(int i=0; i<vowels.length;i++){
            int value=(int)vowels[i];
            if(value>=chValue){
                if((value-chValue) < small ){
                    small=(value-chValue);

                }
            }else {
                if((chValue- value) < small ){
                    small=(chValue-value);

                }

            }
        }
        return small;
    }
}
