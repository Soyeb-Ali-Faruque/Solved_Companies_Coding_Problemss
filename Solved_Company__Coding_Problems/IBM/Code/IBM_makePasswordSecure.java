package Code;

public class IBM_makePasswordSecure {
    public static void main(String[] args) {
//        Test cases
//                1) str: "010111"
//                    ans:2
//        2)str:"000111"
//        ans:3
//
    }
    static int makePsswordStrong(String passwordBinary){
        int ans=0;
        for(int i=0;i<passwordBinary.length();i++){
            if(passwordBinary.charAt(i) == '0'){
                ans++;
            }
        }
        return ans;
    }
}
