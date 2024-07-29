package Company_Asked_problems;

public class Accenture_diceSum {
    public static void main(String[] args) {
        System.out.println(diceCount(2));
    }
    public static int diceCount(int sum){
        if(sum > 12){
            return 0;
        }
        int ans=0;
        for(int i=1;i<=6;i++){
            for(int j=1;j<=6;j++){
                if((i+j) ==sum){
                    ans++;
                }
            }

        }
        return ans;
    }
}
