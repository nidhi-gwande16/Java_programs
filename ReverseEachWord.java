package strings;

/**
Java Program to reverse each word in String 
 */
import java.util.*;

public class ReverseEachWord {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Sentence");
        String sentence=sc.nextLine();
        
        System.out.println(reverseWord(sentence));
        
    }
    public static String reverseWord(String sentence) {
        String words[]=sentence.split("\\s");
        
        String result="";
        for(String word:words)
        {
            StringBuilder sb=new StringBuilder(word);
            sb.reverse();
            result=result+sb.toString()+" ";
        }
        return result.trim();
    }
}
