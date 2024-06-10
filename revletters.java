package strings;

public class ReverseOnlyLetters {
                    public static void main(String args[]){
                        String s="a-bC-dEf-ghIj";
                        System.out.println(reverseOnlyLetters(s));
                    
                    }
                    public static String reverseOnlyLetters(String s)
                    {
                        int start=0;
                        int end=s.length()-1;
                        char c[]=s.toCharArray();
                        
                        while(start<end)
                        {
                            if(!Character.isLetter(c[start]))
                            {
                                start++;
                            }
                            else if(!Character.isLetter(c[end]))
                            {
                                end--;
                            }
                            else
                            {
                                char temp=c[start];
                                c[start]=c[end];
                                c[end]=temp;
                                start++;
                                end--;
                            }
                            
                        }
                        return new String (c);
                        
                    }
    
}
