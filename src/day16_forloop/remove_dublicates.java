package day16_forloop;

public class remove_dublicates {
    public static void main(String[] args) {
        String a = "abab";
        String result = "";
        for(int i = 0; i <=3; i ++){
            if (result . contains(""+a.charAt(i))){
                continue;
            }
            result += a.charAt(i);

        }
        System.out.println(result);
    }
}
