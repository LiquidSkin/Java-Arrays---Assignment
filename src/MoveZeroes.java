import java.util.*;
import java.util.Scanner;

public class MoveZeroes {
    public static void moveZeroes(int[] arr, int n)
    {
        System.out.println("The Array Elements before moving zeroes");
        for(int i=0; i<n; i++)
        {
            System.out.print(arr[i] + " ");
        }
        int count = 0;
        for(int j=0; j<n; j++)
        {
            if(arr[j] != 0)
            {
                arr[count] = arr[j];
                count++;
            }
        }
        while(count < n)
        {
            arr[count] = 0;
            count++;
        }
        System.out.println("After moving the zeroes at the end");
        for(int k=0; k<n; k++)
        {
            System.out.print(arr[k] + " ");
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
        moveZeroes(arr,n);
    }
}
