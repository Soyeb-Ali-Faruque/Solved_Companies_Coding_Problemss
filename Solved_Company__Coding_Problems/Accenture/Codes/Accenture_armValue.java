package Company_Asked_problems;


public class Accenture_armValue {
    public static void main(String[] args) {
        int[] Test1={0,2,3,4,5};
        int[] Test2={0,11,1};
        System.out.println(findArmValue(Test2));

    }

    public static int findArmValue(int[] array) {
        if (array.length == 0) {
            return 0;
        }
        int evenSum = 0;
        int oddSum = 0;
        for (int i = 0; i < array.length; i++) {
            if ((array[i] & 1) == 1) {//odd
                oddSum += array[i];
            } else {//even
                evenSum += array[i];
            }
        }
        if (oddSum % 2 == 1) {
            if (evenSum >= oddSum) {
                return evenSum - oddSum;
            }
            return oddSum - evenSum;
        }
        return evenSum + oddSum;
    }

}
