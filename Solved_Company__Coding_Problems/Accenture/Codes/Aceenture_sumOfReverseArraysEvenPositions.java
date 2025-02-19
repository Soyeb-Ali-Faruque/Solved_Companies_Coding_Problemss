package Company_Asked_problems;

public class Aceenture_sumOfReverseArraysEvenPositions {
    public static void main(String[] args) {
        int[] Test={10,20,30,40,50,60};
        System.out.println(reverseArrayEvenPosSum((Test)));

    }
    static int reverseArrayEvenPosSum(int[] array){
        //
        if(array.length == 1) return array[0];
        if(array.length == 0) return -1;
        //reverse the number of an array
        for(int i=0;i<array.length/2;i++){
            int temp=array[i];
            array[i]=array[array.length-1-i];
            array[array.length-1-i]=temp;
        }
        //even position sum
        int sum=0;
        for(int i=0;i<array.length;i++){
            if(i%2 == 0) sum+=array[i];


        }
        return sum;
    }
}
