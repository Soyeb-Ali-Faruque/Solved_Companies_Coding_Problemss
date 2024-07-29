package Company_Asked_problems;

import java.sql.Array;
import java.util.Arrays;
//Time complexity : 0(n log n)
//Space complexity : 0(n)
public class Accenture_findOnBulbs {
    public static void main(String[] args) {
        System.out.println(countOnBulbs(10));

    }
    public static int countOnBulbs(int n){
        int[] array=new int[n];
        //we iterate and change the value of array for 1st round
        for(int i=0;i<n;i++){
            array[i]=1;
        }

        //calculating till the ith rounds
        for(int i=2;i<=n;i++){
            int increment=1;
            int pos=i;
            while (pos<=n){
                 pos=i*increment;
                if(pos-1<=n-1){
                    if(array[pos-1] ==0){
                        array[pos-1]=1;
                    }else{
                        array[pos-1]=0;
                    }
                    increment++;
                }else{
                    break;
                }
            }
        }
        //count and return answer that how many bulbs are on by visualizing the arrays's 1
        int ans=0;
        for(int i=0;i<n;i++){
            if(array[i]==1){
                ans++;
            }
        }
        System.out.println(Arrays.toString(array));

        return ans;
    }
}
