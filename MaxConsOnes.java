package aaray;


public class MaxOnes {
                public static void main(String args[]){
                int[] nums={1,1,0,1,1,1,1};
                System.out.println(MaxConsOnes(nums));
                }
                
                public static int MaxConsOnes(int[] nums)
                {
                    int current_count=0;
                    int max_count=0;
                    for(int i=0;i< nums.length;i++)
                    {
                        if(nums[i]==1)
                        {
                            current_count++;
                            max_count=Math.max(max_count,current_count);
                        }
                        else
                        {
                            current_count=0;
                        }
                    }
                    return max_count;
                    
                }
    
}
