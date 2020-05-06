import java.util.*;
import java.util.Scanner;

public class DifferenceLargestSmallest {
    public static void difference(int[] arr, int n)
    {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<n; i++)
        {
            if(arr[i] < min)
            {
                min = arr[i];
            }
            if(arr[i] > max)
            {
                max = arr[i];
            }
        }
        System.out.println("The maximum and minimum elements of the array are" + " " + max +  " " + min);
        int diff  = max - min;
        System.out.println("The difference between the elements is" + " " + diff);


    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array");
        for(int j=0; j<n; j++)
        {
            arr[j] = sc.nextInt();
        }
        difference(arr,n);
    }

}
