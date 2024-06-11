package strings;
import java.util.HashMap;


 
public class Wordpattern {
  public static void main(String args[])
  {
      String pattern="abba";
      String s="dog,cat,cat,fish";
      System.out.println(wordPattern(pattern,s));
  }
  public static boolean wordPattern(String pattern,String s)
  {
      String[] a1=s.split(" "); //convert string into array
      if(pattern.length()!=a1.length)
      {
          return false;
      }
      HashMap<Character,String> hm = new HashMap<>();
      for(int i=0;i<pattern.length();i++)
      {
          char c=pattern.charAt(i);
          boolean containsKey=hm.containsKey(c);
          if(hm.containsValue(a1[i])&& !containsKey)
          {
              return false;
          }
          if(containsKey && hm.get(c).equals(a1[i]))
          {
              return false;
          }
          else
          {
              hm.put(c, a1[i]);
          }
      }
      return true;
  }
}
