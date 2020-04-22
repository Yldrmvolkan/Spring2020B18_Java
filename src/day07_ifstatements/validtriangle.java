package day07_ifstatements;

public class validtriangle {
    public static void main(String[] args) {
        short angle1 = 30;
        short angle2 = 50;
        short angle3 = 60;
        int sumofangles = angle1 + angle2 + angle3;
        boolean validtriangle = sumofangles ==180;

        if(validtriangle){
            System.out.println(" the shape is not triangle.");
        }
    }
}
