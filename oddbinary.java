class characters {
    public String maximumOddBinaryNumber(String s) {
        int count=0;
        for(char c:s.toCharArray())
        if(c=='1') count++;
        int len=s.length();
        char[] a1=new char[len];
        for(int i=0;i<len;i++)
           a1[i]='0';

        a1[len-1]='1';
        count--;

        int i=0;
        while(count-->0)
           a1[i++]='1';

           return new String(a1); 
    }

}
