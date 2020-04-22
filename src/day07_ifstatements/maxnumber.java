package day07_ifstatements;

public class maxnumber {
    public static void main(String[] args) {
        double a = 100;
        double b = 200;
        double c = 300;
        boolean agreater = a>b || a>c;
        boolean bgreater = b>a || b>c;
        boolean cgreater = c>a && c>b;
        if(agreater){
            System.out.println(" greater than others");
        }
        if(bgreater){
            System.out.println(" greater than others");
        }
        if(cgreater){
            System.out.println(" greater than others");
        }
        }
    }

