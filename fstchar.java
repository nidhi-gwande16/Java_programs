package strings;

public class FirstUniqChar {
    public static void main(String args[]){
        String s="aabbcdee";
        System.out.println(firstUniqChar(s));
    }
    public static int firstUniqChar(String s) {
    int[] count=new int[26];
    for(char c:s.toCharArray())
    {
        count[c-'a']++;
    }    
    int n=s.length();
    for(int i=0;i<n;i++)
    {
        char c=s.charAt(i);
        if(count[c-'a']==1)
        return i;
    }
    return -1;
    }
}
