package Company_Asked_problems;


import java.util.Arrays;

public class countMinimulSquareSum {
    public static void main(String[] args) {
        int n=6;
        int number = (int)Math.sqrt(n);
        int[] dp=new int[n+1];
        dp[0]=0;
        int[] numbers=new int[number];
        Arrays.fill(dp,-1);
        for(int i=1;i<=number;i++){
            numbers[i-1]=i*i;
        }
        System.out.println(minSquareSum(n,numbers,dp));
        System.out.println(Arrays.toString(numbers));

    }
    public static int minSquareSum(int n,int[] array,int[] dp){
        int answer=Integer.MAX_VALUE;
        if(n==0){
            return 0;
        }

        for(int i=0;i<array.length;i++){
            int sub_answer=0;
            if(n-array[i]>=0){
                if(dp[n-array[i]]!=-1){
                    sub_answer=dp[n-array[i]];
                }else {
                    sub_answer=minSquareSum((n-array[i]),array,dp);
                }
            }
            if(answer>=sub_answer+1){
                answer=sub_answer+1;
            }
        }
        dp[n]=answer;
        return answer;
    }


    }


