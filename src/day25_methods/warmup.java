package day25_methods;

public class warmup {
    public static void main(String[] args) {
        String str= "ABAB";
        String result = "";
        for (int i =0; i<str.length(); i++){
            char ch = str.charAt(i);
            if (!result.contains(""+ch)){
                result+=ch;

            }

        }
        System.out.println(result);
        String str1= "abcabcabc";
        String result1= removedublicate(str1);
        System.out.println(result1);

    }
    public static String removedublicate(String str1) {
        String result1 = "";
        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            if (!result1.contains("" + ch)) {
                result1 += ch;

            }


        }
        return result1;

    }}