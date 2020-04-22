package Resources;

        import java.util.Arrays;

public class Library {

    public static int[] sortDesending(int[] arr){
        Arrays.sort(arr);  // {1,2,3,4};  ==> {4,3,2,1};
        int[] RevArr = new int[arr.length] ;

        int j = arr.length-1;
        for(int i =0; i < arr.length; i++ ){
            RevArr[i] = arr[j];
            j--;
        }

        return RevArr;

    }

    public static String Reverse(String str){  // can reverse a string and returns string
        String Reverse = "";

        for(int i = str.length()-1; i >= 0; i-- ){
            Reverse  += str.charAt(i);
        }

        return  Reverse;
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




