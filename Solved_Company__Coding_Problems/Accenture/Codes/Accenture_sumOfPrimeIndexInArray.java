package Company_Asked_problems;

public class Accenture_sumOfPrimeIndexInArray {
    public static void main(String[] args) {
        int[] Test1={1,20,30,40,50,60,70,80,90,100};
        System.out.println(primeIndexSum(Test1));

    }
    static int  primeIndexSum(int[] array){
        if(array.length <= 2){
            return  -1;
        }
        int ans=0;
        for(int i=2;i<array.length;i++){
            if(isPrime(i)){
                ans+=array[i];
            }
        }
        return ans;


    }

    static boolean isPrime(int n){
        if( n <=1) return false;
        if(n==2 || n==3) return true;
        if(n%2==0 || n%3 == 0) return false;

        for(int i=5; i<=n/2;i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
}
