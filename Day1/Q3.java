/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day1;

import java.util.*;

public class Q3 {
        public static void main(String args[]){
              Scanner obj=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=obj.nextInt();
        Set<Integer> set=new HashSet<>();
        int temp=0,res=n;
        while(res!=1 && !set.contains(res)  ){
            set.add(res);
            res=divide(res);
        }
        if(res==1)
            System.out.println("true");
        else
            System.out.println("false");
        }
        static int square(int a)
        {
            return a*a;
        }
        static int divide(int n)
        {
            int temp=n,rem=0,sum=0;
            while(temp>0)
            {
                rem=temp%10;
                sum+=square(rem);
                temp=temp/10;
            }
            return sum;
        }
}
