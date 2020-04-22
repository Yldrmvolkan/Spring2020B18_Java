package day23_custom_metods;

public class uniquevalues {
    public static void main(String[] args) {
        String[] a = {"a", "b", "a", "c"};
        for (String each : a) {
            int count = 0;
            for (String each1 : a) {                    //  String a ='abcabcabc'==> day19 da gecti bakabilirsin
                if (each1.equals(each)) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(each);
            }
        }


    }}