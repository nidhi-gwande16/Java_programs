package recusrionpractice;
import java.util.*;

/**
Binary Search Algorithm with recursion
 */
public class BinarySerachAlgo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements you want to store in array");
        int n=sc.nextInt();
      
        int arr[]=new int[n];
        System.out.println("Enter the numbers ");
        for(int i=0;i<n;i++)
        {
           arr[i]=sc.nextInt();
        }
      
        Arrays.sort(arr);
        System.out.println("The sorted array is");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");   
        }
        
        System.out.println("\n\nenter the number you want to search");
        int target=sc.nextInt();
       
        System.out.println(BS(n,arr,target,0,arr.length));
    }
    public static int BS(int n,int[] arr,int target ,int start,int end) {
        //we will pass start and end index in the argument 
        
        
        if(start>end)
            return -1;
        
        int mid=start+(end-start)/2;
        
        if(arr[mid]==target)
            return mid;
        
        if(target<arr[mid])
        {
            return BS(n,arr,target,start,mid-1);
        }
      return BS(n,arr,target,mid+1,end);
    }
}
