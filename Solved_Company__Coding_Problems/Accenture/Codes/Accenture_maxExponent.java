package Company_Asked_problems;

public class Accenture_maxExponent {
    public static void main(String[] args) {
        System.out.println(findMaxExponent(7,12));

    }
    public static int findMaxExponent(int x,int y){
        int ans=0;
        for(int i=x;i<=y;i++){
            if(i%2==0){
                int sub_ans=exponentOfTwo(i);

                if(ans<=sub_ans){
                    ans=sub_ans;
                }

            }

        }
        return ans;
    }
    static int exponentOfTwo(int n){
        if(n%2==1 || n==0){
            return 0;
        }
        int count=exponentOfTwo(n/2);
        count++;
        return count;
    }
}
