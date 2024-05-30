package arrays;

import java.util.Map;
import java.util.HashMap;

public class ContainsDuplicate2 {
    public static void main(String args[]){
        int nums[]={1,2,3,1,2,3};
        int k=2;
        System.out.println(containsDupicate(nums,k));
    }
    public static boolean containsDupicate(int[] nums, int k)
    {
         HashMap<Integer, Integer> mp1=new HashMap<>();
      for(int i=0;i<nums.length;i++)
      {
        if(mp1.containsKey(nums[i]))
        {
            int idx=mp1.get(nums[i]);
            if((i-idx)<=k)
            return true;
            else
            mp1.put(nums[i],i);

        }
        else
           mp1.put(nums[i],i);
      }
      return false;
    }
    
}
