package Company_Asked_problems;

public class Accenture_sumArrayPrimeElements {
    public static void main(String[] args) {
        int[] Test1={10,41,18,50,43,31,29,25,59,96,67};
        System.out.println(isSumPrime(Test1));

    }
    static int isSumPrime(int[] array){
        int sum=0;
        int primeSum=0;
        int large=0;
        int primeLarge=0;
        for(int i=0;i<array.length;i++){
            if(isPrime(array[i])){
                primeSum+=array[i];
                if(primeLarge <= array[i]){
                    primeLarge=array[i];
                }
            }
            sum+=array[i];
            if(large<=array[i]){
                large=array[i];
            }
        }
        if(primeSum == 0){
            return (sum-large);
        }
        return (primeSum-primeLarge);
    }
    static boolean isPrime(int n){
        for(int i=2;i<=n/2;i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
}
