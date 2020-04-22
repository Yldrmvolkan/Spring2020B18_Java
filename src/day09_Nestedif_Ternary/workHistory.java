package day09_Nestedif_Ternary;

public class workHistory {

    public static void main(String[] args) {
        double salary = 120000;
        byte workHistory = 3;

        if(salary>=30000){
            if(workHistory>=2){
                System.out.println("you are qualifield");
            }else{
                System.out.println("you must 2 years");
            }

        }else{
            System.out.println("you must 30000");
        }


    }
}
