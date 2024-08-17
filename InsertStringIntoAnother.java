//Java program to insert a string into another string  without using any predefined method.

package stringbuildpractice;

import java.util.*;

public class InsertString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");
        String original=sc.nextLine();
        System.out.println("Enter the string you want to insert");
        String insertString=sc.nextLine();
        System.out.println("At index");
        int index=sc.nextInt();
        System.out.println("original String "+original);
        System.out.println("Insert String "+insertString);
        System.out.println("modified String "+insertString(original,insertString,index) );
    }
    public static String insertString(String original ,String insertString, int index) {
        String s=new String();
       for (int i = 0; i < original.length(); i++) {
            // If the current index is the insertion point, add the entire insertString
            if (i == index) {
                s += insertString;
            }
            // Add the current character from the original string
            s += original.charAt(i);
        }

        // If the index is at the end of the string, add the insertString at the end
        if (index >= original.length()) {
            s += insertString;
        }

        return s;
    }
}
