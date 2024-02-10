import java.util.*;
public class a4b3 {
    public static void main(String args[])
    {
   Scanner obj=new Scanner(System.in);
   String s=obj.next();
        String res="";
        int n=s.length();
        int count=1;
    
           for(int i=0;i<n;i++)
           {
               if(i+1==n)
               {
                 res+=s.charAt(i);
                 res+=count;  
               break;
               }
             if(s.charAt(i)!=s.charAt(i+1))
             {
                 res+=s.charAt(i);
                 res+=count;
                count=1;
             }
             else
             count++;
             
           }
         System.out.println(res);

       
    }
}
