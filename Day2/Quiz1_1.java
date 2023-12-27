package Day2;

import java.util.Scanner;

public class Quiz1_1 {

    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter array size");
        int n = obj.nextInt(), mul = 1, k = 0;
        int arr[] = new int[n];
        int result[] = new int[n];
        System.out.println("Enter array elements");
        for (int i = 0; i < n; i++) {
            arr[i] = obj.nextInt();
        }

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {
                if (i != j) {
                    mul *= arr[j];
                }
            }
            result[k++] = mul;
            mul = 1;
        }

        System.out.println("Resultant Array");
        for (int i : result) {
            System.out.println(i + " ");
        }

    }
}
