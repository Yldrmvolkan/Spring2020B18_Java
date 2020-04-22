package day25_methods;

public class frequency {
    public static void main(String[] args) {
        String str1 ="aaa";
        String str2 ="aa";
        int count =0;
        if (str1.contains(str2)){
            count++;
            str1 = str1.replaceFirst(str2,"");
        }
        System.out.println(str1);
        System.out.println(count);

    }
}
