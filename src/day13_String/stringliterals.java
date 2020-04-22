package day13_String;

public class stringliterals {
    public static void main(String[] args) {
        String str1 = "cat";
        String str2 = new String("cat");
        System.out.println( str1 + ":" + str2);
        System.out.println(str1==str2); //false
        String str3 = "cat";
        System.out.println(str1==str3); //true
        String str4 = new String("cat");
        System.out.println(str2==str4);// false because different object
        String s1 = "java"; //string pool immutable we cannot modify
         s1 = "javascript";
        System.out.println(s1); //javascript
        String s2 = "java";     //java in console
        System.out.println(s2);
        System.out.println(s1 == s2);// false
    }
}
