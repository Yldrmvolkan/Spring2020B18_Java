package day15_forloop;

public class reverse {
    public static void main(String[] args) {
        String str = "enis";
        String reverse = "" + str.charAt(3) +str.charAt(2) +str.charAt(1)+ str.charAt(0);
        String reverse1 = str.substring(3,4) +str.substring(2,3) +str.substring(1,2)+str.substring(0,1);
        System.out.println(reverse);
        System.out.println(reverse1);
    }
}
