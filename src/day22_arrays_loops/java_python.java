package day22_arrays_loops;

public class java_python {
    public static void main(String[] args) {
        String sentence = "i like java and javascribt and python and python";
        int javacount = 0;
        int python =0;
        String [] word = sentence.split(" ");
        for (String each :word){
            if (each.contains("java")){
                javacount++;
            }
            if (each.contains("python")){
                python++;
            }
        }
        System.out.println(javacount);
        System.out.println(python);
        System.out.println(javacount==python);
    }
}
