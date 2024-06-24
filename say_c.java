package number;

public class CountSay {
    public static void main(String[] args) {
        int n=4;
        System.out.println(countAndSay(n));
    }
    public static String countAndSay(int n) {
      StringBuilder sb= new StringBuilder("1");
      while(--n>0)
      {
        StringBuilder s=new StringBuilder();
        for(int i=0;i<sb.length();i++)
        {
            int count=1;
            while (i + 1 < sb.length() && sb.charAt(i) == sb.charAt(i + 1))
            {
            ++count;
            ++i;
            }
        s.append(count).append(sb.charAt(i));
        }
      sb=s;
      }
      return sb.toString();
    }
}

