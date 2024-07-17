package Company_Asked_problems;

public class Accenture_somOfLeader {
    public static void main(String[] args) {
        int[] TestArray1={52,66,64,36,45,24,32};
        int[] TestArray2={33,7,21,14};
        System.out.println(sumOfLeaders1(TestArray2));


    }
    public static int sumOfLeaders(int[] array){
        if(array.length == 0){
            return  -1;
        }

        int sum=array[array.length-1];
        int highest=sum;
        for(int i= array.length-2;i>=0;i--){
            if(array[i]>highest){
                sum+=array[i];
                highest=array[i];
            }
        }
        return sum;
    }
    public static int sumOfLeaders1(int[] array){
        int sum=0;
        boolean var=false;
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i]<array[j]){
                    var=true;
                    break;
                }}
            if(var){
                var=false;
                continue;}
            System.out.println(array[i]+" "+i);
            sum+=array[i];}
        return sum;
    }

}
