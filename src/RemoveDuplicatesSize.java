import java.util.*;
import java.util.Scanner;


public class RemoveDuplicatesSize {
    public static void duplicatesSize(int[] arr, int n)
    {
        Set<Integer> set = new HashSet<Integer>();
        for(int i=0; i<n; i++)
        {
            if(!set.contains(arr[i]))
            {
                set.add(arr[i]);
            }
        }
        System.out.println("The size of the array after removing duplicates is" + " " + set.size());
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
        duplicatesSize(arr,n);
    }
}
