package strings;
public class PrefixOfWord {
        public static void main(String[] args) {
            String sentence="I love eating Burger";
            String searchWord="Burg";
            System.out.println(IsPrefix(sentence,searchWord));

            
            
        }
        public static int IsPrefix(String sentence,String searchWord)
        {
            String[] sentences=sentence.split(" ");
            for(int i=0;i<sentences.length;i++)
            {
                if(sentences[i].startsWith(searchWord))
                {
                    return i+1;
                }
            }
            return -1;
        }

    
}
