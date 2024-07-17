package Company_Asked_problems;

public class AccentureCoding03_05_2024 {
    public static void main(String[] args) {
        int[] TestArray1={-3,-1,-1,-1};
        int[] TestArray2={-7,2,4,9,-8,1,6};

        equilibrium_position(7,TestArray2);

    }

    //Given an array and its size so you have to find index+! of equilibrium position
//An equilibrium is a position where its left sum and right sum is equal
//Note:
//(1)There is only only one or no equilibrium position in the array
//(2) Array does not contain any 0 value but may contains -v or +v
    public static void equilibrium_position(int n, int array[]) {
        int leftSum=0;
        int rightSum=0;
        //calculating the right Sum
        for(int i=0; i<n;i++){
            rightSum+=array[i];
        }
        System.out.println("rs: "+rightSum);

        //finding equilibrium position
        for(int i=0; i<n; i++){
            if(i==(n-1)){
                System.out.println("Not Found");
                break;
            }
            if(i==0){
                leftSum=array[i];
                rightSum-=leftSum;
                continue;
            }
            rightSum-=array[i];
            System.out.println("test "+rightSum);
            if(rightSum == leftSum ){
                System.out.println(i+1);
                break;
            }
            leftSum+=array[i];

        }
    }


}
