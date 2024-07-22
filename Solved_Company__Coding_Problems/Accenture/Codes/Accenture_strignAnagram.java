package Company_Asked_problems;

public class Accenture_strignAnagram {
    public static void main(String[] args) {
        String Test1[] = {"batman", "maatab"};
        System.out.println(checkAnagram(Test1[0], Test1[1]));

    }

    public static Boolean checkAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            String str = "";
            int count = 0;
            for (int j = 0; j < str2.length(); j++) {
                if (str1.charAt(i) == str2.charAt(j) && count == 0) {
                    count++;
                    continue;
                }
                str += str2.charAt(j);
            }
            str2 = str;
        }
        System.out.println(str2.length());
        if (str2.length() == 0) {
            return true;
        }
        return false;
    }
}
