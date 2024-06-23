package strings;
public class IsEquivalent {
    public static void main(String[] args) {
        String word1="cccddabba";
         String word2="babababab";
         System.out.println(EquivString(word1,word2));
    }
    public static boolean EquivString(String word1,String word2)
    {
        int leng=word1.length();
        int[] freq=new int[26];
        for(int i=0;i<leng;i++)
        {
            freq[word1.charAt(i)-'a']++;
            freq[word2.charAt(i)-'a']--;
            
        }
        for(int i=0;i<26;i++)
        {
            if(Math.abs(freq[i])>3)
            {
                return false;
            }
        }
        return true;
    }
    
}
