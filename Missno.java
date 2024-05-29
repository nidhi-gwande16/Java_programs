package arrays;

public class MissingNum {
    public static void main(String args[]){
        int nums[]={9,6,4,2,3,5,7,0,1};
        System.out.println(Missingnum(nums));
    }
    public static int Missingnum(int nums[]){
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum=sum+nums[i]; //sum of all the elements present in the array
        }
        int actualsum=nums.length*(nums.length+1)/2;
        int missingno=actualsum-sum;
        
        return missingno;
        
               
    }
}

