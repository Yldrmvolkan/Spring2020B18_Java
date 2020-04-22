package day08_ifstatements;
/* declare 3 numbers n1, n2, n3
  			if n1 and n2 are equal  => n1&n2 are equal   			if n2 and n3 are equal ==> n2&n3 are equal
   			if n3 and n1 are qual ==>n3&n1 are equal
			if all equal ==> all equal
			if none of them are euqal ==> none of them are equal	2.. write a program that can find the number of days in a month
	 	(Assume that Feb has 28 days)

 */
public class equalnumbers {
    public static void main(String[] args) {
        double n1 = 100.5;
        double n2 = 100.5;
        double n3 = 100.5;
         boolean n1equaln2 = n1 == n2 && n2 != n3;
         boolean n1equaln3 = n1 == n3 && n1 != n2;
         boolean n2equaln3 = n2 == n3 && n2 != n1;
         boolean allequal = n1 == n2 && n1 == n3;
         boolean nonofthemequal = n1 != n2 && n2 != n3;

         if (n1equaln2){
             System.out.println(n1 +"  is equal to"+ n2);

         }
         if (n1equaln3) {
             System.out.println(n1 +"  is equal to"+ n3);
         }
         if (n2equaln3) {
             System.out.println(n2 +"  is equal to"+ n3);
         }
         if (allequal) {
             System.out.println(n1 + ", " + n2 + " and " + n3 +"  are equal");
         }
         if (nonofthemequal){
             System.out.println(n1 +" , " + n2 +  " and " + n3 +" are not equal");
         }
    }
}
