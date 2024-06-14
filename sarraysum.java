package arrays;
import java.util.HashMap;

public class SubarraySum {
    
    public static void main(String args[])
    {
        int[] nums={23,2,6,4,7};
        int k=6;
        System.out.println(checkSubarraySum(nums,k));
    }
    
    public static boolean checkSubarraySum(int[] nums, int k) {
         HashMap<Integer,Integer> hm=new HashMap<>();
         int prefixSum=0;
         for(int i=0;i<nums.length;i++)
         {
            prefixSum+=nums[i];
            int remainder=prefixSum%k;
            if(remainder==0 && i>=1) 
            return true;

            if(hm.containsKey(remainder))
            {
                int index=hm.get(remainder);
                if((i-index)>=2)
                return true;
            }
            else
            hm.put(remainder,i);


         }
         return false;

    }
}

