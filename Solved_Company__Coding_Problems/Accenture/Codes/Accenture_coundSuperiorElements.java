package Company_Asked_problems;

public class Accenture_coundSuperiorElements {
    public static void main(String[] args) {
        int[] Test1={8,10,6,2,9,7};
        System.out.println(countSuperiors(Test1));
    }
    public static int countSuperiors(int[] array){
        if(array.length == 0){
            return -1;
        }
        //count superior elements
        int ans=1;
        int superior=array[array.length-1];
        for(int i=array.length-2;i>=0;i--){
            if(array[i]>superior){
                superior=array[i];
                ans++;
            }
        }
        return ans;
    }
}
