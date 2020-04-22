package day21_multidimensinol_arrays;

public class scrumteam {
    public static void main(String[] args) {
        String [] devteam = {"zeynep","seyma","enis"};
        String [] testers = {"ali","ahmed","canisi"};
        String [][] scrumteam = {devteam,testers};
        scrumteam [0] [2] = "leylis";
        System.out.println(scrumteam[0][2]);// leylis
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
        for (String a:scrumteam[1]){
            System.out.println(a);

        }
    }
}
