package arrays;

public class ValidAnagram {
    public static void main(String args[]){
                 String a="anagram";
                 String b="nagaram";
                System.out.println(isAnagram(a,b));
             }
             public static boolean isAnagram(String a, String b ){
                 int m=a.length();
                 int n=b.length();
                 if(m!=n){
                     return false;
                 }
                 else{
                     int count[]=new int[26];
                     for(int i=0;i<m;i++)
                     {
                         count[a.charAt(i)-'a']++;
                     }
                     for(int i=0;i<n;i++)
                     {
                         count[b.charAt(i)-'a']--;
                     }
                     for(int i=0;i<count.length;i++)
                     {
                         if(count[i]!=0)
                         {
                             return false;
                         }
                     }
                     return true;
                 }
             }

    
}
