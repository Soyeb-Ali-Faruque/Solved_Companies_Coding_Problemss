package Company_Asked_problems;

public class Accenture_roundNumber {
    public static void main(String[] args) {
        System.out.println(checkroundNumber(20));
    }
    public static boolean checkroundNumber(int n){
        while(n !=1){
            n=calculateSum(n);
            if(n == n ){
                break;
            }
        }
        if(n == 1){
            return true;
        }
        return false;
    }
    static int calculateSum(int n){
        int ans=0;
        while(n!=0){
            int digit=n%10;
            ans+=digit*digit;
            n/=10;
        }
        return  ans;
    }
}
