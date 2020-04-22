package day21_multidimensinol_arrays;

public class emails {
    public static void main(String[] args) {
        String[] emails = {"Cybertek@gmail.com", "Cybertek@yahoo.com", "Cybertek@hotmail.com", "Cybertek@outlook.com"};
        for (String a : emails){
            if (a.endsWith("@gmail.com")){
                continue;
            }
            System.out.println(a);

        }
    }
}
