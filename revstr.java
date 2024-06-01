class String {
    public void rev(char[] a1,int i, int j)
    {
        while(i<j)
        {
            char temp=a1[i];
            a1[i]=a1[j];
            a1[j]=temp;
            i++;
            j--;
        }
    }
    public String reverseStr(String s, int k) {
        char[] a1=s.toCharArray();
        int i=0,n=a1.length;

        while(i<n)
        {
            int j =Math.min(i+k-1,n-1);
            rev(a1,i,j);
            i=i+2*k;


        }
        return new String(a1);
    }
}
