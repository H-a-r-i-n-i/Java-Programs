package zoho;

public class StringScreening {

    public static void main(String args[]) {
      Scanner obj=new Scanner(System.in);
        String s =obj.next();
        String res = "";
        int n = s.length();
        int scr = obj.nextInt();
        int stars = 1;
        int count = 0;
        int flag = 0;

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == ' ') {
                count++;
            }
        }
        int size = scr - (n - count);
        int fill = size / count;
        int remainder = size % count;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) != ' ') {
                res += s.charAt(i);
            }
            if (s.charAt(i) == ' ') {
                for (int k = 1; k <= fill; k++) {

                    if (stars == size) {
                        break;
                    }

                    res += "*";
                    stars++;
                }
                if (flag == 0) {
                    for (int r = 1; r <= remainder; r++) {
                        res += "*";
                        flag = 1;
                    }

                }
            }
        }
        System.out.println(res + " " + res.length());
    }
}
