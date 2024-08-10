package strings;
/*
Java Program to capitalize(First word ) each word in String
*/

import java.util.*;

public class CapitalizeFirstWord {
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enetr sentence");
            String senetnce=sc.nextLine();
            
           
            
            System.out.println(CapitalizeWords(senetnce));
    }
    
    public static String CapitalizeWords(String senetnce) {
        
        String words[]=senetnce.split("\\s");
         
        
        String result="";
        for(String word:words)
        {
                String firstWord=word.substring(0,1);
                String lowercaseWord=word.substring(1);
                
                result=result+firstWord.toUpperCase()+lowercaseWord+" ";
                
        }
        return result.trim();
        
        
    }
}
