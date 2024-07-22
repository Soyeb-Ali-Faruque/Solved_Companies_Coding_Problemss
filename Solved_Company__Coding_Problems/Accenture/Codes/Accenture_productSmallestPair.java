import java.lang.reflect.Array;
import java.util.Arrays;

public class Accenture_productSmallestPair{
    public static void main(String[] args) {
        int[] Test_Array1={5,2,4,3,9,7,1};
        int[] Test_Array2={9,8,3,-7,3,9};
        System.out.println(productSmallestPair(4,Test_Array2));
    }
    public static int productSmallestPair(int sum, int[] arr){
        if (arr.length<2){
            return  -1;
        }

        Arrays.sort(arr);
        int smallest=arr[0];
        int secondSmallest=arr[1];
        if((smallest+secondSmallest)<=sum){
            return (smallest*secondSmallest);
        }

        return 0;
    }
}
