package Day1;

import java.util.Scanner;

public class Q1b {
    public static void main(String args[]){
    float n1,n2,avg;
         Scanner obj=new Scanner(System.in);
        System.out.println("Enter 2 float numbers:");
         n1=obj.nextFloat();
            n2=obj.nextFloat();
            avg=(n1+n2)/2;
         System.out.println("The Average of "+n1+"and "+n2+"is =>");
         System.out.format("%.2f",avg);
}
}
