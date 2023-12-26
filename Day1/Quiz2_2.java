package Day1;

import java.util.Scanner;

public class Quiz2_2 {
    
    public static void main(String args[]) {
         Scanner obj = new Scanner(System.in);
         String str,result="";
             System.out.println("Enter the string");
        str = obj.next();
        int n=str.length(),i;
        int count=1;
        for(i=1;i<n;i++)
        {
            if(str.charAt(i)!=str.charAt(i-1))
            {
                result+=str.charAt(i-1)+""+count;
                count=1;
            }
            else
                count++;
        }
        result+=str.charAt(i-1)+""+count;
                     System.out.println("Compressed string:"+result);

    }
}
