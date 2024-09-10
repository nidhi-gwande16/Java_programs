package array;

/**

 */
public class SmallestLargestNum {
    public static void main(String[] args) {
        int[] arr={23,45,12,34,80,99};
        int[] result=findNums(arr);
        System.out.println("smallest number "+result[0]);
        System.out.println("smallest number is at "+result[1]);
        System.out.println("Largesllest number "+result[2]);
        System.out.println("Largesllest number is at "+result[3]);
        
    }
    public static int[] findNums(int[] arr) {
        int max=arr[0];
        int minindex=0;
        int min=arr[0];
        int maxindex=0;
        
        
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
                minindex=i;
            }
            if(arr[i]>max)
            {
                max=arr[i];
                maxindex=i;
            }
        }
        return new int[] {min,minindex,max,maxindex};
    }
}
