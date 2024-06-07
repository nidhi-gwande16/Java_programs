package arrays;
import java.util.Arrays;


public class SortedArray {
            public static void main(String args[]){
                int nums[]={5,7,7,8,8,10};
                int target=8;
                System.out.println(Arrays.toString(searchRange(nums,target)));
            }
            static int[] searchRange(int[] nums,int target)
            {
                int[] a1=new int[2];
                a1[0]=a1[1]=-1;
                for(int i=0;i<nums.length;i++)
                {
                    if(nums[i]==target)
                    {
                        a1[0]=i;
                        while(i<nums.length && nums[i+1]==target)
                        {
                            i++;
                            a1[1]=i;
                            break;
                        }
                    }
                }
                return a1;
            } 
}
