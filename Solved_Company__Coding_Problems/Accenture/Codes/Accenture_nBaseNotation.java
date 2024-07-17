package Company_Asked_problems;

public class Accenture_nBaseNotation {
    public static void main(String[] args) {

        System.out.println(decToNBase(718,12));

    }
    public static String decToNBase(int number,int divider){
        if(number/divider == 0){
            int remainder=number%divider;
            return  checkRemainder(remainder);
        }
        String str="";
        str+=decToNBase((number/divider),divider);
        int remainder=number%divider;
        str+=checkRemainder(remainder);
        return str;
    }
    static String checkRemainder(int remainder){
        if(remainder>9){
            //convert to character or notation
            int base=55+remainder;
            char ch=(char)base;
            return String.valueOf(ch);

        }
        return String.valueOf(remainder);

    }
}
