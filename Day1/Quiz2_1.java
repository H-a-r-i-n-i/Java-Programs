package Day1;

import java.util.*;

public class Quiz2_1 {

    public static void main(String args[]) {
        int n, odd_count = 0, even_count = 0;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter size of the array");
        n = obj.nextInt();
        int arr[] = new int[n];
        System.out.println("enter array Elements");

        for (int i = 0; i < n; i++) {
            arr[i] = obj.nextInt();
            if (arr[i] % 2 != 0) {
                odd_count++;
            } else {
                even_count++;
            }

        }
        int even[] = new int[even_count];
        int odd[] = new int[odd_count];
        even_count = 0;
        odd_count = 0;
        for (int i = 0; i < n; i++) {

            if (arr[i] % 2 != 0) {
                odd[odd_count++] = arr[i];
            } else {
                even[even_count++] = arr[i];
            }

        }
        System.out.println("Even Elements");
        for (int e : even) {
            System.out.print(e + " ");
        }
        System.out.println("Odd Elements");
        for (int o : odd) {
            System.out.print(o + " ");
        }

    }
}
