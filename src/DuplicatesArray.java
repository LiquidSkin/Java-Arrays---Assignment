import java.util.*;
import java.util.Scanner;

public class DuplicatesArray {
    public static void removeDuplicates(int[] arr, int n)
    {
        Set<Integer> set = new HashSet<Integer>();
        System.out.println("After removing duplicates");
        for(int i=0; i<n; i++)
        {
            if(!set.contains(arr[i]))
            {
                System.out.print(arr[i] + " ");
            }
            set.add(arr[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int j = 0; j < n; j++) {
            arr[j] = sc.nextInt();
        }
        removeDuplicates(arr,n);
    }
}
