package arrays;
import java.util.Arrays;

import java.util.HashMap;

import java.util.HashMap;

public class Twosum {
    public static int[] twoSum(int[] nums, int target){
         HashMap<Integer, Integer> map= new HashMap<Integer,Integer>();
       for(int i=0;i<nums.length;i++)
       {
           if(map.containsKey(nums[i]))
           {
               return new int[] {map.get(nums[i]),i};
               
           }
           else{
           map.put(target-nums[i],i);
       }
      
    }
           return new int[] {};

   
    }
    
            public static void main(String args[]){
                int[] nums={2,7,11,15};
                System.out.println(Arrays.toString(twoSum( nums,9)));
            }

    
}