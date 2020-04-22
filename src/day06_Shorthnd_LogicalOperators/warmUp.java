package day06_Shorthnd_LogicalOperators;

public class warmUp {

    public static void main(String[] args) {
        double numofgal = 1;
        double galtoliters = numofgal * 3.785;
        String result = numofgal + " gallons equal to: " + galtoliters + " liters";
        System.out.println(result);
        System.out.println(numofgal +" gallons equal to: "+ galtoliters + " liters") ;

        int x = 300;
        int y = 400;
        int z = x + y - x *y +x / y;
        //      300 +400- 300 * 400 + 300 /400
    }

    }




/*warmup task:

    1. write a java program that converts gallons to liters

                        1 gallon = 3.785 liters

                        1 litter = 1/3.785

    2. write a java program that converts litters to gallons

                        1 gallon = 3.785 liters

                        1 litter = 1/3.785

    3. manually calculate the following code fragements:

                1. int a = 200;

                    int b = -a++ + - --a * a-- % 2

                    b = ?

                2. int x = 300;

                   int y = 400;

                   int z = x + y - x * y +x / y;

 */