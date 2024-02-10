public class xpattern {
   public static void main(String args[])
   {
     Scanner obj=new Scanner(System.in);
     String s=obj.next();
       int n=s.length();
       int is=n,last=n-1;
       for(int i=0;i<n;i++)
       {
           for(int j=0;j<n;j++)
           {
               if(i==j)
                   System.out.print(s.charAt(i));
               else if(j==last)
                   System.out.print(s.charAt(j));
               else 
                   System.out.print(" ");
           }
           last-=1;
            System.out.println();
       }
}
}
