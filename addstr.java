package strings;
public class AddString {
       public static void main(String args[]){
         String num1="456";
         String num2="77";
         System.out.println(addStrings(num1,num2));
       }
           
    public static String addStrings(String num1, String num2) {
        int a1=num1.length()-1;
        int a2=num2.length()-1;
        StringBuilder ans=new StringBuilder();
        int carry=0,base=10;
        while(a1>=0|| a2>=0)
        {
            int sum=0,s1=0,s2=0;
            if(a1>=0)
                s1=num1.charAt(a1--)-'0';
            if(a2>=0)
                s2=num2.charAt(a2--)-'0';
            sum=s1+s2+carry;
            if(sum>=base)
            {
                carry=1;
                sum=sum-base;
            }
            else
                carry=0;
            ans.append(sum);
        }
        if(carry==1)
            ans.append(carry);
        return ans.reverse().toString();
        
    }
}

