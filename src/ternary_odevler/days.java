package ternary_odevler;

public class days {
    public static void main(String[] args) {
        int num = 7;
        String result = "";
        if (num >= 1 && num <=7) {
            result = (num == 1) ? "monday" : (num==2)? "tuesday" : (num==3)? "wednesday" : (num==4)? "thursday" : (num==5) ? "friday" : (num==6)? "saturday" : "sunday";
            System.out.println(result);

        }
    }
}
