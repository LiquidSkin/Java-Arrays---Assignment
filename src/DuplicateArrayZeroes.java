import java.util.*;
import java.util.Scanner;

public class DuplicateArrayZeroes {

    public static void moveZeroesDuplicate(int[] arr, int n)
    {
        Set<Integer> set = new HashSet<Integer>();
        int[] res = new int[n];
        for(int i=0; i<n; i++)
        {
            if(!set.contains(arr[i]))
            {
                set.add(arr[i]);
            }
        }
        int count = 0;
        for(int num: set)
        {
            res[count] = num;
            count++;
        }
        while(count < n)
        {
            res[count] = 0;
            count++;
        }
        System.out.println("After removing duplicates and appending the elements");
        for(int k=0; k<n; k++)
        {
            System.out.print(res[k] + " ");
        }
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
        moveZeroesDuplicate(arr,n);
    }
}
