/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day3;
import java.util.*;

public class Quiz1_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter elements of the array separated by spaces:");
        String[] input = scanner.nextLine().split(" ");
        int[] array = Arrays.stream(input).mapToInt(Integer::parseInt).toArray();

        System.out.println("Enter the partition size:");
        int partitionSize = scanner.nextInt();

        System.out.println("Enter the partition order:");
        int[] partitionOrder = new int[array.length / partitionSize];
        for (int i = 0; i < partitionOrder.length; i++) {
            partitionOrder[i] = scanner.nextInt();
        }

        int[][] partitionedArray = partitionArray(array, partitionSize);
        int[] mergedArray = mergePartitions(partitionedArray, partitionOrder);

        System.out.println("Output:");
        for (int num : mergedArray) {
            System.out.print(num + " ");
        }

        scanner.close();
    }

    public static int[][] partitionArray(int[] arr, int size) {
        int len = arr.length;
        int numOfPartitions = (int) Math.ceil((double) len / size);
        int[][] partitions = new int[numOfPartitions][size];
        int partitionIdx = 0;

        for (int i = 0; i < len; i++) {
            partitions[partitionIdx][i % size] = arr[i];

            if ((i + 1) % size == 0 || i == len - 1) {
                partitionIdx++;
            }
        }
        return partitions;
    }

    public static int[] mergePartitions(int[][] partitions, int[] order) {
        int[] result = new int[partitions.length * partitions[0].length];
        int resultIdx = 0;

        for (int i = order.length - 1; i >= 0; i--) {
            int partitionIndex = order[i] - 1;
            for (int j = 0; j < partitions[partitionIndex].length; j++) {
                result[resultIdx++] = partitions[partitionIndex][j];
            }
        }
        return result;
    }
}
