import java.util.*;
import java.util.Scanner;

public class SecondMaximum {
    public static int secMax(int[] arr, int n)
    {
        int result = -1;
        Arrays.sort(arr);
        int max = arr[n-1];
        for(int j=n-2; j>=0; j--)
        {
            if(arr[j] < max)
            {
                result = arr[j];
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
        int secondMax = secMax(arr,n);
        if(secondMax == -1)
        {
            System.out.println("There is no second maximum element");
        }
        else
        {
            System.out.println("The second maximum element in the array is");
            System.out.println(secondMax);
        }
    }
}
