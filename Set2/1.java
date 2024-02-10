import java.util.Scanner;

public class a4b3Reverse {

    public static void main(String[] args) {
         Scanner obj=new Scanner(System.in);
         System.out.println("Enter string");
   String str=obj.next();
        int n = str.length();
        int count = 1, j;
        String num = "";
        for (int i = 0; i < n; i++) {
            if (!(str.charAt(i) >= 'a' && str.charAt(i) <= 'z')) {
                j = i;
                while (!(str.charAt(j) >= 'a' && str.charAt(j) <= 'z')) {
                    num += str.charAt(j);
                    j++;
                    if (j == n) {
                        break;
                    }
                }
                count = Integer.parseInt(num);
                for (int c = 0; c < count; c++) {
                    System.out.print(str.charAt(i - 1));
                }

                i = j;

                num = "";
            }
        }
    }
}
