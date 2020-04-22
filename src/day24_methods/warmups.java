package day24_methods;



public class warmups {
    public static void main(String[] args) {
        double num1= 10;
        double num2= 5;
        int a = 4;
        int b = 6;
        max(a,b);
        calculator(num1,num2,'+');
    }
    public static void max(int a, int b){
        if (a>b){
            System.out.println("max number is "+a);

        }else {
            System.out.println("max number is "+b);
        }
    }
    public static void calculator(double num1, double num2, char operator){
        switch (operator){
            case '+':
                System.out.println(num1+num2);
                break;
            case '-':
                System.out.println(num1-num2);
                break;
            case '/':
                System.out.println(num1/num2);
                break;
        }
    }
    public static void palindrome(String str){
        String reversed ="";
        for (int i = str.length()-1; i>=0; i--){
            reversed += str.charAt(i);
        }
    }

}
