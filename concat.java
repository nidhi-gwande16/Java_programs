package List;

import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;


public class ConcatenatedWord {
    
    public static List<String> findConcatWords(String[] words)
    {
        HashMap<String,Boolean> hmap=new HashMap<>(); 
        Set<String> hset=new HashSet<>();
        for(String word:words)
        {
            hset.add(word);
        }
        List<String> result=new ArrayList<>();
        for(int i=0;i<words.length;i++)
        {
            if(IsConcat(words[i],hset,hmap))
            {
                result.add(words[i]);
            }
        }
        return result;
        
    }
    public static boolean IsConcat(String word,Set<String> st,Map<String , Boolean> hmap)
    {
        if(hmap.containsKey(word))
                {
                    return hmap.get(word);
                }
        for(int i=0;i<word.length();i++)
        {
            String prefix =word.substring(0,i+1);
            String suffix =word.substring(i+1,word.length());
            if(st.contains(prefix)&& st.contains(suffix)|| st.contains(prefix) && IsConcat(suffix, st,hmap));
            {
                hmap.put(word,true);
                return true;
            }         
            
        }
        hmap.put(word, Boolean.FALSE);
                    return false;
    }
    
        public static void main(String args[]){
            String[] words={"cat","dog","catdog"};
            System.out.println(findConcatWords(words));
        }

    
}
