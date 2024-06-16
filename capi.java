class String {
    public boolean detectCapitalUse(String word) {
        int capital=0,lowercase=0,first=0;
        for(char c:word.toCharArray())
        {
            if(c>=65 && c<=90){
                capital++;

                if(first==0)
                    first=1;
                }
                else{
                    lowercase++;
                    if(first==0)
                        first=2;
            }
        }
        if(capital==0|| lowercase==0|| first==0||capital==0)
        {
            return true;
        }
        else
        return false;
    }
}
