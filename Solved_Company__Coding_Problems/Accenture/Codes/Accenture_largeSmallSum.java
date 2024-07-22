public class Accenture_largeSmallSum{
    public static void main(String[] args) {
        int[] Test_Array1={3,2,1,7,5,4};
        int[] Test_Array2={8,0,2,3,5,6};
        System.out.println(largeSmallSum(Test_Array2));

    }
    public static int largeSmallSum(int[] arr){
        int large=0;
        int secondlarge=0;
        int small=Integer.MAX_VALUE;
        int secondSmall=Integer.MAX_VALUE;
        if(arr.length <=3 ){
            return  0;
        }
        for(int i=0; i<arr.length;i++){
            if(i%2 == 0){
                //even
                if(arr[i]>=large){
                    secondlarge=large;
                    large=arr[i];

                }
                if(arr[i]>=secondlarge && arr[i]<large){
                    secondlarge=arr[i];
                }

            }
            else {
                //odd
                if(arr[i]<=small){
                    secondSmall=small;
                    small=arr[i];

                }
                if(arr[i]<=secondSmall && arr[i]>small){
                    secondSmall=arr[i];
                }

            }
        }

        return (secondlarge + secondSmall );
    }
}
