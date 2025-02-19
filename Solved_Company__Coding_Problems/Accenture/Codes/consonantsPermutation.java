package Company_Asked_problems;

public class consonantsPermutation {
    public static void main(String[] args) {
        System.out.println(ans("abbccdee"));

    }
    //counting permutation of consonants
    static int ans(String str){
        int count_consonant=0;
        //counting
        for(int i=0;i<str.length();i++){
            if(isVowel(str.charAt(i)) == false){
                count_consonant++;
            }
        }
        //if there is no consonant then return zero
        if(count_consonant == 0) return 0;

        int consonant_factorial=factorial(count_consonant);
        // count dupplicat consonant and answer computation
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(isVowel(ch)){
                continue;
            }
            // counting duplicacy
            int count=0;
            for(int j=i+1;j<str.length();j++){
                if(ch == str.charAt(j)){
                    count++;
                }
            }
            System.out.println(count);
            int num=factorial(count);
            consonant_factorial/=num;

        }


        if(consonant_factorial < 0) return -1;
        return consonant_factorial;
    }


    //calculating factorial of a number
    static int factorial(int number){
        int n=1;
        for(int i=1;i<=number;i++){
            n*=i;
        }
        return n;
    }

    // check vowel
    static boolean isVowel(char ch){
        ch=Character.toLowerCase(ch);
        if(ch=='a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            return true;
        }
        return false;
    }
}
