package Day1;
import java.util.*;
public class Q2 {
      public static void main(String[] args)
    {
          int n1,n2,result=0;
          char c;
         Scanner obj=new Scanner(System.in);
        
          try{
              System.out.println("Enter 2 numbers:");
         n1=obj.nextInt();
         n2=obj.nextInt();
          System.out.println("Enter + for addition,- for subtraction,* for multiplication,/ for division:");
          c=obj.next().charAt(0);
          switch(c)
          {
              case '+':
                  result=n1+n2;
                  break;
              case '-':
                  result=n1-n2;    
                   break;
              case '*':
                  result=n1*n2;
                   break;
              case '/':
                  if(n2==0)
                  System.out.println("Cannot perform division by zero operation");
                  else
                  result=n1/n2;
              default:
                  break;
                  
          }
            System.out.println("Result:"+result);
          }
          catch(InputMismatchException e){
               System.out.println("Enter Valid input");
          }
          
          
         
         
    }
}
