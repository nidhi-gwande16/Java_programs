package arrays;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class LonelyNumber { 
        public static void main(String args[]){
            int nums[]={10,6,5,8};
             System.out.println(lonelynum(nums));
        }

    public static List<Integer> lonelynum(int[] nums){
        
        List<Integer> result=new ArrayList<Integer>();
        
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(hm.containsKey(nums[i]))
            {
                hm.put(nums[i],hm.get(nums[i])+1);
            }
            else
            {
                hm.put(nums[i],1);
            }
        }
            for(int i=0;i<nums.length;i++)
            {
                if(hm.get(nums[i])==1 && !hm.containsKey(nums[i]+1)&& !hm.containsKey(nums[i]-1))
                        {
                            result.add(nums[i]);
                        }
            }
        return result;
    }
}
