import java.util.Scanner;
import java.util.*;

public class SecondMinimum {
    public static int secMin(int[] arr, int n)
    {
      int result = -1;
      Arrays.sort(arr);
      int min = arr[0];
      for(int i=1; i<n; i++)
      {
          if(arr[i] > min)
          {
              result = arr[i];
              break;
          }
      }
      return result;
    }


    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        int secondMin = secMin(arr,n);
        if(secondMin == -1)
        {
            System.out.println("There is no second minimum element");
        }
        else
        {
            System.out.println("The second minimum element in the array is");
            System.out.println(secondMin);
        }
    }
}
