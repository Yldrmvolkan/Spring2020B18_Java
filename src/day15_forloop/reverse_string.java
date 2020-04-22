package day15_forloop;

public class reverse_string {
    public static void main(String[] args) {
        String str = "java";
        String reverse= "" + str.charAt(3) +str.charAt(2) +str.charAt(1)+ str.charAt(0);
        int lastindexnum = str.length()-1;
        for(int i =lastindexnum; i >= 0; i--){
            System.out.println(str.charAt(i)); //reverse1 += str.charAt(i);ACGF``
        }
    }
}
