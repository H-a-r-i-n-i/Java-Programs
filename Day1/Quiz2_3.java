package Day1;

import java.util.Scanner;

public class Quiz2_3 {

    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        String str, result = "";
        System.out.println("Enter the string");
        str = obj.next();
        int n = str.length();
        int l1 = (n / 3) + 1, l2 = l1 - 2;
        int  temp2 = l2;
        for (int i = 0; i < n; i++) {
            if (i >= l1 && temp2 >= 0) {
                System.out.println();
                for (int s = temp2; s >= 1; s--) {
                    System.out.print("  ");
                }
                System.out.print(str.charAt(i));            
                temp2--;
            } else {
                System.out.print(str.charAt(i)+" ");
            }

        }
    }
}
