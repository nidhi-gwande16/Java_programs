package arrays;

import java.util.*;
///LINEAR SEARCH ALGORITHM 
public class FindNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter array size: ");
        int size=sc.nextInt();
        int nums[] =new int[size];
        System.out.println("enter elements: ");
        for(int i=0;i<size;i++)
        {
            nums[i]=sc.nextInt();
        }
        
        System.out.print("Find number x= ");
        int x=sc.nextInt();
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==x)
                System.out.println(i); 
            else{
                System.out.println("number not found");
                break;  
            }
        }
        
    }
}
