package functions;

import java.util.Scanner;
public class SumOfOddNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("n= ");
        int n=sc.nextInt();
        System.out.println(oddNumbers(n));
    }
    public static int oddNumbers(int n)
    {
        int sum=0;
       for(int i=0;i<=n;i++)
       {
           if(i%2!=0)
           {
               sum=sum+i;
           }
           
       }
       return sum;
    }
}
