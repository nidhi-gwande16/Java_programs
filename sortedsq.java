class Arrays {
    public int[] sortedSquares(int[] nums) {
        int i=0;
        int n=nums.length;
        for( i=0;i<n;i++)
        {
            if(nums[i]>=0)
            break;
        }
        for(int j=0;j<n;j++)
        {
            nums[j]=nums[j]*nums[j];
        }
        int j=i-1,k=0;
        int[] a1=new int[n];

        while(j>=0 && i<n)
        {
            if(nums[i]<nums[j])
            a1[k++]=nums[i++];
            else
            a1[k++]=nums[j--];

        }
        while(j>=0)
        {
            a1[k++]=nums[j--];
        }
        while(i<n)
         a1[k++]=nums[i++];
         return a1;
    }
}
