package day09_Nestedif_Ternary;

public class ageGroups_NestedIf {
     /*
    write a program that can define the age groups of a person
            age groups are:
                    Teenager (< 21)
                    Adult   (>=21 && <55 )
                    Senior  ( > 55 )                  age cannot be negative or greater than 150     */


    public static void main(String[] args) {
        int age = 27;
        String ageGroup = "";

        if (age < 150 && age > 0)
        {/*
            if(age<21){
                ageGroup = "teenager";
            }else if( age > 25 && age<55) {
                ageGroup = "adult";
            }else{
                ageGroup = "senior";
            }*/

            ageGroup = (age < 21) ? "teenager" : (age >= 21 && age < 55) ? "adult" : "senior";

        } else {
            ageGroup = "invalid";


        }
        System.out.println(ageGroup);
    }
}

