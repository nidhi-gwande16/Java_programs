package number;

public class ClimbingStairs {
        public static void main(String args[]){
            int n=4;
            System.out.println(climb( n));
        }
        static int climb(int n)
        {
            if(n<3)
            {
                return n;
            }
            int a=3 ,b=2;
            for(int i=0;i<n-3;i++)
            {
                a=a+b;
                b=a-b;
            }
            return a;
        }
    
}
