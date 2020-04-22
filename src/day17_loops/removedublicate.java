package day17_loops;

public class removedublicate {
    public static void main(String[] args) {
        String str = "java is fun, java is cool";

        int i =0;
        while (str.contains("java")){
            i++;
            str = str.replaceFirst("java","");

        }
        System.out.println(str);
    }
}
