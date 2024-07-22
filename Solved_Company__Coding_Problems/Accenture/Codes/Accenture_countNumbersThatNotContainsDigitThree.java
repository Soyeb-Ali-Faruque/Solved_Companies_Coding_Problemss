package Company_Asked_problems;

public class Accenture_countNumbersThatNotContainsDigitThree {
    public static void main(String[] args) {
        System.out.println(countNumbers(45));
    }
    public static int countNumbers(int n){
        int count=0;
        for(int i=1;i<=n;i++){
            int number=i;
            while(number!=0){
                if(number%10==3){
                    break;
                }
                number=number/10;
            }
            if(number == 0){
                count++;
            }
        }
        return count;
    }
}
