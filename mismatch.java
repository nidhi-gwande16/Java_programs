class Array{
    public int[] findErrorNums(int[] nums) {
        boolean[] a1=new boolean[nums.length+1];
        int[] result={0,0};
        for(int num:nums)
        {
            if(a1[num]==true)
            result[0]=num;
            else
            a1[num]=true;

        }
        for(int i=1;i<=nums.length;i++)
        {
            if(a1[i]==false)
            {
                result[1]=i;
                break;

            }
        }
        return result;
    }
}
