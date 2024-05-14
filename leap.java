package conditionalstatement;


public class Leapyear {
    public static void main(String args[]){
      int a=2100;
      if(a%400==0)
          System.out.println("leap year");
      else if(a%100==0)
          System.out.println("leap year");
      else if(a%4==0)
          System.out.println("leap year");
      else
           System.out.println("not a leap year");

    }
}
