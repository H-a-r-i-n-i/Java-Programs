public class Pattern1 {

    public static void main(String args[]) {
     Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        int temp = 0, ntemp = n;
        for (int i = 1; i <= n; i++) {
            temp = i;
            
            for (int j = 1; j <= i; j++) {

                System.out.print(temp + " ");
                ntemp--;
                temp += ntemp;
            }
            ntemp = n;
            System.out.println();
        }
    }
}
