package day13_String;

public class string_manipulations {
    public static void main(String[] args) {
        String str1 = "cybertek";
        //             o1234567
        char ch1= str1.charAt(7);
        System.out.println(ch1); // gives k
        System.out.println(ch1=='k'); //true
        System.out.println(ch1=='K');//false
        int lenght = str1.length();
        System.out.println(lenght);// gives you how many chracter

        String str2 = "today is good day come on play football";
        int str3 = str2.length();
        System.out.println(str3);
        int maxnumber = str2.length() -1;//  for findig max number
        System.out.println(maxnumber);
        String s1 = "cybertek";
        s1= s1.concat(" school");
        System.out.println(s1); // cybertek school
        String s2 = "hadi cano ";
        System.out.println(s2.concat(" balik yemeye"));
        System.out.println(s2); //  hadi cano


        String name= "LOLUC";
        name = name.toLowerCase();
        System.out.println(name);
        String name2 = "cano";
        name2= name2.toUpperCase();
        System.out.println(name2);
        String A1 ="         today is a good";
        A1 = A1.trim();
        System.out.println(A1);

    }
}
