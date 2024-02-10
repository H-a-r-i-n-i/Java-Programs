public class Pattern3 {

    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter n");
        int n = obj.nextInt();
        int k = 0, l = 0;
        for (int i = 1; i <= n; i++) {
             for (int j = 1; j <= i; j++) {
                if (i % 2 != 0) {
                    if (k == 0) {
                        k = i;
                    }
                    System.out.print(k + " ");
                    k = k + 2;
                } else {
                    if (l == 0) {
                        l = i;
                    }
                    System.out.print(l + " ");
                    l = l + 2;
                }
            }
            System.out.println();
        }
    }
}
