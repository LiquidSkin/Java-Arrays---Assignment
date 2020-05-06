import java.util.*;
import java.util.Scanner;

public class TwoSumZero {
    public static void findElements(int[] arr, int n)
    {
        Arrays.sort(arr);
        int l = 0;
        int r = n - 1;
        int t_l = 0;
        int t_r = 0;
        int min_sum = Integer.MAX_VALUE;
        while(l < r)
        {
            if(arr[l] + arr[r] < Math.abs(min_sum))
            {
                min_sum = arr[l] + arr[r];
                t_l = arr[l];
                t_r = arr[r];
            }
            if(arr[l] + arr[r] < 0)
            {
                l++;
            }
            else
            {
                r--;
            }
        }
        System.out.println("The two elements whose sum is closest to zero are" + " " + t_l + " " + t_r);
    };
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
        findElements(arr,n);
    }
}
