package day08_ifstatements;

public class repl_itPractice {

    public static void main(String[] args) {

        int numberOfBed1 = 1;
        int numberOfBed2 = 2;
        int numberOfBed3 = 3;

        int startPrice1 = 1100;
        int startPrice2 = 1850;
        int startPrice3 = 2550;


        if(numberOfBed1==1){
            System.out.println("One Bedroom Selected starting price: "+ startPrice1);
        }
        if(numberOfBed2==2){
            System.out.println("Two Bedroom Selected starting price: "+ startPrice2);
        }
        if(numberOfBed3==3){
            System.out.println("Three Bedroom Selected starting price: "+ startPrice3);

        }

        System.out.println("====================================================================");


        int a = 14;
        int b = 52;
        int c = 25;
        boolean amed = (a<b && a>c) || (a>b && a<c);
        boolean bmed = (b<c && b>a) || (b>c && b<a);
        boolean cmed = (c<b && c>a) || (c>b && c<a);
         if(amed){
             System.out.println("medium value is: "+a);
         }
         if(bmed){
             System.out.println("medium value is: "+b);

         }
         if(cmed){
             System.out.println("medium value is: "+c);
         }


    






    }

}
