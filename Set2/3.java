public class IntegerToWord {
    public static void main(String args[]) {
        Scanner obj=new Scanner(System.in);
      System.out.println("enter number");
      int n=obj.nextInt();
        String ans="";
        ans+=numtoword((n/10000000),"crore ");
           System.out.println(ans);
        ans+=numtoword(((n/100000)%100),"lakh ");
           System.out.println(ans);
        ans+=numtoword(((n/1000)%100),"thousand ");
           System.out.println(ans);
        ans+=numtoword(((n/100)%10),"hundred ");
           System.out.println(ans);
        if(n>100 && n%100>0){
            ans+="and ";
        }
        ans+=numtoword((n%100),"");
        System.out.println(ans);
    }

  static  String numtoword(int n,String s){
        String one[]={"","one ","two ","three ","four ","five ","six ","seven ","eight ","nine ","ten ","eleven ","twelve ","thirteen ","fourteen ","fifteen ","sixteen ","seventeen ","eighteen ","nineteen "};
        String tens[]={"","","twenty ","thirty ","forty ","fifty ","sixty ","seventy ","eighty ","ninety "};
        String str="";
        if(n>19){
            str+=tens[n/10]+one[n%10];
        }else{
            str+=one[n];
        }
        if(n!=0){
            str+=s;
        }
        return str;
    }
}
