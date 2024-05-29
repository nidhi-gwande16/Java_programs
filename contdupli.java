package arrays;

import java.util.Map;

import java.util.HashMap;

public class ComntainsDuplicate {
     public static void main(String args[]){
         int[] nums={1,2,3,1};
         System.out.println(containsduplicate(nums));
     }
     public static boolean containsduplicate(int[] nums){
         Map<Integer,Integer> hm= new HashMap<Integer,Integer>();
         for(int i=0;i<nums.length;i++)
         {
             if(hm.containsKey(nums[i]))
             {
                 return true;
             }
             else {
                 hm.put(nums[i],i);
             }
         }
         return false;
     }
     
}
