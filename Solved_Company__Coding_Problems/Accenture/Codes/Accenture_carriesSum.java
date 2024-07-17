package Company_Asked_problems;

public class Accenture_carriesSum {
    public static void main(String[] args) {
        System.out.println(numberOfCarries(329,470));

    }
    public static int numberOfCarries(int number1,int number2){
        int count=0;
        int carry=0;
        while(number1>0 || number2>0){
            int digit1=number1%10;
            int digit2=number2%10;
            if(digit1+digit2+carry >9){
                carry=1;
                count++;
            }
            else {
                carry=0;
            }
            number1=number1/10;
            number2=number2/10;
        }
        return count;
    }
}
