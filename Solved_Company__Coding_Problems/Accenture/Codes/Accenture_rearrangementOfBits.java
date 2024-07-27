package Company_Asked_problems;

public class Accenture_rearrangementOfBits {
    public static void main(String[] args) {
        System.out.println(positionSum(10));
    }
    public static int positionSum(int number){
        int count=0;
        int ans=0;
        while(number!=0){
            if(number%2 == 1){
                count++;
            }
            number/=2;
        }
        for(int i=0;i<count;i++){
            ans+=Math.pow(2,i);
        }
        return ans;
    }



}

