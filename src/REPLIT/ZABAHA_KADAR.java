package REPLIT;


public class ZABAHA_KADAR {
    public static void main(String[] args) {
        int age = 8;
        String clas ="";
        if (age >2 && age <19){
            String clas1= (age == 2)? "toddler" : (age>3 && age<5)? "early" : (age >=6 && age <=7) ? "young" : (age >=8 && age <=10)? "elementary" : (age ==11 & age ==12)? "middle" : (age ==13)? "impossible" : (age >=14 && age <=16) ? "high school" : (age >=17 && age <=18)? "scholar" : "ineligible";
            System.out.println(clas1);
            byte no1 = 12;
            byte no2 = 13;
            byte no3 = 14;
            if (no1 > no2 && no1 >no3){
                System.out.println("no1 is biggest");

            } else if ( no2>no1 && no2>no3){
                System.out.println("no2 is biggest one");

            }else{
                System.out.println("no3 is biggest");
            }

        }
    }
}
