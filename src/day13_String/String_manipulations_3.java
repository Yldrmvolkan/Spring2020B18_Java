package day13_String;

public class String_manipulations_3 {
    public static void main(String[] args) {
        String ind = "i love my wife seyma secretly";
        int num = ind.indexOf("sec");
        System.out.println(num);



        String sis = "cybertek chool is awesome";
          int first = sis.indexOf("s");
         int second = sis.indexOf("cyb")+1;
        System.out.println(second);
        System.out.println(first);

    }
}