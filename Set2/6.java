import java.util.Scanner;

public class PalindromeWithoutSplChracter {
    public static void main(String args[])
    {
         Scanner obj=new Scanner(System.in);
        System.out.println("Enter the String");
        String str=obj.nextLine();
        String copy="",reverse="";
        
        for(int i=0;i<str.length();i++)
        {
            if(((int)str.charAt(i)>=65 && (int)str.charAt(i)<=90) || ((int)str.charAt(i)>=97 && (int)str.charAt(i)<=122))
                copy+=str.charAt(i);
        }
        for(int i=copy.length()-1;i>=0;i--)
        {
            reverse+=copy.charAt(i);
        }
       
        if(copy.equals(reverse))
            System.out.println("Palindrome");
        else
            System.out.println("Not a Palindrome");
        
    }
}
