package Day2;
    import java.util.*;
public class Quiz1_2 {



    public static void main(String[] args) {
               Scanner obj = new Scanner(System.in);

        System.out.println("Enter array size");
        int n = obj.nextInt();
        int arr[] = new int[n];
  
        System.out.println("Enter array elements");
        for (int i = 0; i < n; i++) {
            arr[i] = obj.nextInt();
        }
        generatePermutations(arr,0);
    }

    private static void generatePermutations(int[] array, int index) {
        if (index == array.length - 1) {
            System.out.println(Arrays.toString(array));
        } else {
            for (int i = index; i < array.length; i++) {
                swap(array, index, i);

                generatePermutations(array, index + 1);

                swap(array, index, i);
            }
        }
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}


