package Company_Asked_problems;

public class Accenture_printElementsOddEvenAsString {
    public static void main(String[] args) {
        int[] Test={2,2,3,4,5};
        printStr(Test);

    }
    static void printStr(int[] array){
        for(int i=0;i<array.length;i++){
            if(array[i]%2 == 0){
                System.out.print("Even");
            }
            else{
                System.out.print("Odd");
            }
        }
    }
}
