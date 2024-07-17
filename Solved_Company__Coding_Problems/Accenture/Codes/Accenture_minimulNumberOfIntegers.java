package Company_Asked_problems;

public class Accenture_minimulNumberOfIntegers {
    public static void main(String[] args) {
        int[] TestArray1 = {10, 3, 2, 4, 5, 6, 9, 7, 3};
        System.out.println(minumulNomberOfIntegers(TestArray1, 65, 3));

    }

    static int minumulNomberOfIntegers(int[] array, int x, int y) {
        int source = x - y;
        int target = source;
        int index = 0;
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (source == x || source == y) {
                if (array[i] == target) {
                    int sub_ans = (i - index) - 1;
                    if (ans > sub_ans) {
                        ans = sub_ans;
                    }
                    //swapping
                    int temp = target;
                    target = source;
                    source = temp;
                    //update index
                    index = i;
                }
            } else {
                if (array[i] == x) {
                    target = y;
                    source = x;
                    index = i;
                    continue;
                }
                if (array[i] == y) {
                    target = x;
                    source = y;
                    index = i;
                }

            }
        }
        if(ans==Integer.MAX_VALUE){
            return -1;
        }
        return ans;
    }
}
