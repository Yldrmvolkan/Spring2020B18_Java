package day24_methods;

public class calculateage {
   public static void age(int birthyear){
       int currentyear = 2020;
       int age =currentyear-birthyear;
       if (age>0 && birthyear>1900){
       System.out.println(age);
   }else{
           System.out.println("enter true year");
   }

    }

    public static void main(String[] args) {

        age(1944);
        printhellocybertek();
    }
    public static void printhello(){
        System.out.println("hello");
    }
    public static void printcybertek(){
        System.out.println("cybertek");
    }
    public static void printhellocybertek(){
       printhello();
       printcybertek();

    }
}