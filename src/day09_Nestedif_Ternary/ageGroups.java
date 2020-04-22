package day09_Nestedif_Ternary;

public class ageGroups {
    public static void main(String[] args) {

        int age = 100;
        String ageGroup = "";

        if(age<3 && age>0){
            ageGroup ="baby";
        }else if(age>=3 && age<=5){
            ageGroup = "";
        }
    }
}
