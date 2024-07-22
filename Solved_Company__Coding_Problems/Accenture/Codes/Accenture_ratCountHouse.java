//Problem Description :
//        The function accepts two positive integers ‘r’ and ‘unit’ and a positive integer array ‘arr’ of size ‘n’ as its argument ‘r’ represents the number of rats present in an area, ‘unit’ is the amount of food each rat consumes and each ith element of array ‘arr’ represents the amount of food present in ‘i+1’ house number, where 0 <= i
//
//        Note:
//
//        Return -1 if the array is null
//        Return 0 if the total amount of food from all houses is not sufficient for all the rats.
//        Computed values lie within the integer range.
//        Example:
//
//        Input:
//
//        r: 7
//        unit: 2
//        n: 8
//        arr: 2 8 3 5 7 4 1 2
//        Output:
//
//        4
//
//        Explanation:
//        Total amount of food required for all rats = r * unit
//
//        = 7 * 2 = 14.
//
//        The amount of food in 1st houses = 2+8+3+5 = 18. Since, amount of food in 1st 4 houses is sufficient for all the rats. Thus, output is 4.
public class Accenture_ratCountHouse{

    public static void main(String[] args) {



//        int[] Test_Array1={ 2,8,3,5,7,4,1,2};
//        int[] Test_Array2={};
//        System.out.println(check_food(7,2,0,Test_Array2));

    }
    public static int check_food(int r,int u,int n,int[] arr){
        int result=0;
        int target=r*u;
        int sum_of_food=0;
        if(n<=0){
            return -1;
        }
        for(int i=0; i<n;i++){
            result++;
            sum_of_food+=arr[i];
            if(sum_of_food >= target){
                return result;
            }

        }
        return 0;
    }
    public static int OperationsBinaryString(String str){
        if(str.isEmpty()){
            return -1;
        }
        int result=str.charAt(0)-'0';
        for(int i=1;i<str.length()-1;i++){
            if(str.charAt(i)=='A'){
                result=result & (str.charAt(i+1)-'0');
            }
            else if(str.charAt(i)=='B'){
                result=result | (str.charAt(i+1)-'0');
            }

            else{
                result=result ^ (str.charAt(i+1)-'0');
            }
            i++;

        }
        return result;
    }



}
