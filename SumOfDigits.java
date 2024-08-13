package recusrionpractice;
import java.util.*;
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number to add digitts ");
       int n=sc.nextInt();
        System.out.println(sum(n));
    }
    static int sum(int n){
        if(n==0)
            return 0;
        
        return (n%10) + sum(n/10);
    }
    
}
