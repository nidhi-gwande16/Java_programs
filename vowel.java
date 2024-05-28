class String {
    public String reverseVowels(String s) {
        char[] a1=s.toCharArray(); //converting string into array
        int i=0, j=a1.length-1;
        String vowels="aeiouAEIOU";

        while(i<j)
        {
            while(i<j){
                char ch=a1[i];
                if(vowels.indexOf(ch)!=-1)
                break;
                i++;

            }
            while(i<j)
            {
                char ch=a1[j];
                if(vowels.indexOf(ch)!=-1){
                    break;
                }
                j--;
            }
            if(i<j){
                char temp=a1[i]; //swapping
                a1[i]=a1[j];
                a1[j]=temp;
                i++;
                j--;
            }
        }
        return new String(a1);

    }
}
