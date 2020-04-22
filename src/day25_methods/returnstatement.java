package day25_methods;

public class returnstatement {
    public static void main(String[] args) {

        method2();
        System.out.println("hello");
    }
    public static void method1(){
        if (10>9){
            return;                 //current durumdan cikariyor
                                    // yani sonraki cybertek i yazdirmiyor
        }
        System.out.println("cybertek");
    }
    public static void method2(){
        if(10>9){
            System.exit(0);  // entire systemden cikariyor
                                   // main methoda methed2 yazdigimizdan hicbirini yazdirmiyor. cunku system.exit var.
        }
        System.out.println("hello cybertek");
    }
}
