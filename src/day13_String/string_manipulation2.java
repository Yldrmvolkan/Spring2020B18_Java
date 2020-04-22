package day13_String;

public class string_manipulation2 {
    public static void main(String[] args) {
        String str = "cybertek is best school";
        String schoolname = str.substring(0,9);
        System.out.println(schoolname);


        String fullname = "seyma layla";
        String firstname = fullname.substring(0,5);
        String lastname = fullname.substring(6,11);
        System.out.println(firstname);
        System.out.println(lastname);
        String gmail= lastname.concat("_").concat(firstname).concat("@gmail.com");
        System.out.println(gmail);


        String classname = "i love java class today";
        String classname1 = classname.substring(7);
        System.out.println(classname1);


        String name = "covid 18";
        name = name.replace("18", "9");
        System.out.println(name);


        String r1 = "i love java and java clas is java day";
        r1 = r1.replaceFirst("java", "selenium");
        System.out.println(r1);
    }
}
