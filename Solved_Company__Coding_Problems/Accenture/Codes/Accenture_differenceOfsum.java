public class Accenture_differenceOfsum{
    public static void main(String[] args) {
        System.out.println(differenceOfSum(3,10));
    }
    public static int differenceOfSum(int n,int m){
        int divisible_number=0;
        int notDivisible_number=0;
        for(int i=1;i<=m;i++) {

                if (i % n == 0) {
                    divisible_number += i;
                    continue;

            }

            notDivisible_number += i;


        }
        if(notDivisible_number>=divisible_number){
            return (notDivisible_number-divisible_number);
        }
        return (divisible_number-notDivisible_number);
    }
}
