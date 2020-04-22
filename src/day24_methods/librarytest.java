package day24_methods;
import Resources.Library;
public class librarytest {
    public static void main(String[] args) {
        String str ="enis";
        String revstr= Library.Reverse(str);
        System.out.println(revstr);
        int [] arr = {1,6,9,3,5};
         arr = Library.sortDesending(arr);
        System.out.println(arr);

    }
}
