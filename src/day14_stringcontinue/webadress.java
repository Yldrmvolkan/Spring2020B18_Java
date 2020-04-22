package day14_stringcontinue;

public class webadress {
    public static void main(String[] args) {
        String web = "WWW.cybertek.Gov";
        web = web.toLowerCase();
        boolean valid = web.endsWith(".com") || web.endsWith(".edu") || web.endsWith("gov");
        if (web.startsWith("www.") && valid) {
            System.out.println("valid adress");

        } else {
            System.out.println("invalid");
        }
    }
}