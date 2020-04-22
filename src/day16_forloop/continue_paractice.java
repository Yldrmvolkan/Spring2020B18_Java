package day16_forloop;

public class continue_paractice {
    public static void main(String[] args) {
        for (char ch = 'a'; ch<='z'; ch++){
            if (ch == 'y' || ch=='h' || ch =='j' || ch=='d'){  //harf oldugunda && degil || kullanmali
                continue;
            }
            System.out.print(ch+" ");
        }
        System.out.println("                                   ");
        for(int a = 1; a <=100; a++){
            if (a %3==0 && a %5==0){
                continue;
            }
            System.out.print(a+" ");
        }
    }
}
