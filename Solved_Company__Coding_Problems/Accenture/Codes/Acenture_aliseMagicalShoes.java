package Company_Asked_problems;

public class Acenture_aliseMagicalShoes {
    public static void main(String[] args) {
        int[] Test={12,21,3,4};
        System.out.println(countClimbs(Test));

    }
    public static int countClimbs(int[] houses){
        if(houses.length == 0){
            return 0;
        }
        //count houses to be climbed
        int ans=0;
        for(int i=0;i<houses.length;i++){
            if((houses[i] % 3) == 0){
                ans++;
            }
        }
        return ans;
    }
}
