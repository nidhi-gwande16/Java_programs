package strings;

public class VowelString {
    public static void main(String[] args) {
        String[] words={"are","amy","u"};
        int left=0;
        int right=2;
            System.out.println(vowelString(words,left,right));
    }
    public static int vowelString(String[] words, int left, int right)
    {
        
        int count=0;
        
        for(int i=left;i<=right;i++)
        {
            int start=words[i].charAt(0);
            int end=words[i].charAt(words[i].length()-1);
            
            if(start=='a'||start=='e'||start=='i'||start=='o'||start=='u')
            {
                if(end=='a'||end=='e'||end=='i'||end=='o'||end=='u')
                {
                count++;
                }
            }
        }
        return count;
        
    }
    
}
