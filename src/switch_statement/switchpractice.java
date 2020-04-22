package switch_statement;

public class switchpractice {
    public static void main(String[] args) {
        int number = 2;
        switch(number){
            case 4 :
                System.out.println("thursday");
                break; // case closed
            case 3 :
                System.out.println("wednesday");
            default:
                System.out.println("invalid");
                break;

        }
    }
}
