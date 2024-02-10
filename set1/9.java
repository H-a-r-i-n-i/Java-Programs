public class Pattern3 {
    public static void main(String args[])
    {
      Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();     
        for(int i=1;i<=n;i++)
        {
            temp=i;
             for(int s=n-1;s>=i-1;s--)
                System.out.print(" ");
            for(int j=1;j<2*i;j++)
            {
             
                
                if(j>2*i/2)
                    temp+=1;
                else
                    temp--;
                   System.out.print(temp);
            }
       System.out.println();
        }
    }
}
