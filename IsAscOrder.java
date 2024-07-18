package arrays;

import java.util.*;
public class IsAscendungOrder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size");
        int size=sc.nextInt();
        int numbers[]=new int[size];
        System.out.println("Emter elements");
        for(int i=0;i<size;i++)
        {
            numbers[i]=sc.nextInt();
        }
        boolean isAsc=true; //initialition with true
        
        for(int i=0;i<numbers.length-1;i++)
        {
            if(numbers[i]>numbers[i+1])
            {
                isAsc=false;
                break;
            }
        }
        
        if(isAsc)
        {
            System.out.println("Array is in Ascending Order");
        }
        else{
            System.out.println("Array is not in Ascending order");
        }
    }
 
}
