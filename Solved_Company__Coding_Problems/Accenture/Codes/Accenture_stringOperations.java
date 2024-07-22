package Company_Asked_problems;

public class Accenture_stringOperations{
    public static void main(String[] args) {
        String Test1="qlewldoaa life ace by fantasy";
        String Test2="soyeb";
        System.out.println(dificulty(Test1));

    }
    public static int dificulty(String str){
        int hard=0;
        int easy=0;
        int vowelCount=0;
        int consonantCount=0;
        boolean isConsecutive_consonant= false;
        int index=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == ' ' || i==str.length()-1){
                //do something regarding sub string operations
                System.out.println(str.substring(index,i));
                index=i+1;
                if(isConsecutive_consonant){
                    System.out.println("consecutive");
                    hard++;
                    vowelCount=0;
                    consonantCount=0;
                    isConsecutive_consonant=false;
                    continue;

                }
                if(vowelCount>=consonantCount){
                    System.out.println("easy");
                    easy++;
                }
                else{
                    System.out.println("hard");
                    hard++;
                }
                vowelCount=0;
                consonantCount=0;
                continue;

            }
            if(checkVowel(str.charAt(i))){
                vowelCount++;
            }
            else {
                consonantCount++;
                isConsecutive_consonant=checkConsecutive(str,i,isConsecutive_consonant);

            }

        }
        System.out.println(hard+"  "+easy);
        return ((5*hard)-(2*easy));
    }
    static boolean checkVowel(char ch){
        if(ch =='a' || ch =='e' || ch =='i' || ch =='o' || ch =='u' ){
            return true;
        }
        return false;

    }
    static boolean checkConsecutive(String str,int i,boolean isConsecutive){
        if(isConsecutive == true){
            return true;
        }
        if(i+2>=str.length()) {
            return false;
        }
        if(str.charAt(i)== ' '|| str.charAt(i+1)== ' '|| str.charAt(i+2)== ' '){
            return false;
        }
       if(checkVowel(str.charAt(i))==false && checkVowel(str.charAt(i+1))==false&& checkVowel(str.charAt(i+2))==false){
           return  true;

        }

        return  false;
    }
}
