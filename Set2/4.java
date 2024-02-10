public class misMatchPair {
    public static void main(String args[])
    {
      Scanner obj=new Scanner(System.in);
     String str1=obj.next();
     String str2=obj.next();
       int n=str1.length(),j=0;
       String temp1="",temp2="";
       for(int i=0;i<n;i++)
       {
           if(str1.charAt(i)!=str2.charAt(i))
           {
               j=i;
               while(str1.charAt(j)!=str2.charAt(j))
               {
                   temp1+=str1.charAt(j);
                   temp2+=str2.charAt(j);
                   j++;
                   if(j==n)
                   break;
               }
               System.out.println(temp1+","+temp2);
          
               
               temp1="";
               temp2="";
                i=j;
           }
       
       }
        
    }
}
