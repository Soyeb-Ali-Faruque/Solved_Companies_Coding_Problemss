package Company_Asked_problems;

public class Accenture_calculateDivisibilityThreeAndFive {
    public static void main(String[] args) {
        System.out.println(calculate(100,150));

    }
    public static int calculate(int x,int y){
        int sum=0;
        for(int i=x;i<=y;i++){
            if(i%3==0 && i%5==0){
                sum+=i;
            }
        }
        return sum;
    }
}
