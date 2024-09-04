package arrays;

/**
GIVEN AN INTEGER ARRAY OF DISTINCT NUMBERS PRINT THE LARGEST NUMBER IN THE ARRAY AND THE INDEX ON WHICH THE NUMBER IS PRESENT. 
 */
public class FindIndexOfLargestNum {
        public static void main(String[] args) {
        int[] arr={23,45,67,12,1};
        int[] result=FindNum(arr);
            System.out.println("largest number is "+result[0]);
            System.out.println("index of largest numbers is "+result[1]);
            //System.out.println(FindNum(arr));
    }
        public static int[] FindNum(int[] arr) {
           int largeNum=arr[0];
           int index=0;
        for(int i=1;i<arr.length-1;i++)
        {
            if(arr[i]>largeNum)
            {
                largeNum=arr[i];
                index=i;
            }
                
        }
        return new int[]{largeNum,index};
        
    }
}
