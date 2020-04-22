package offıce_hours;

public class loops {
    public static void main(String[] args) {
        String str = "AABCC";
        String result ="";
        String nonduplicate = "";
        for (int a =0; a<= str.length()-1; a++){
            if (!nonduplicate.contains(""+ str.charAt(a))){
                nonduplicate +=str.charAt(a);
            }
        }




        int count = 0;
        for (int a =0; a <= str.length()-1; a++){
            if (str.charAt(a)=='A'){
                count++;
            }
        }

    }
}
