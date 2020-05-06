import java.util.*;
import java.util.Scanner;

public class TwoSum {
    public static void findElements(int[] arr, int n, int no)
    {
        boolean flag = true;
        Arrays.sort(arr);
        int l = 0;
        int r = n - 1;
        while(l < r)
        {
            if(arr[l] + arr[r] == no)
            {
                flag = false;
                System.out.println("The two elements which sum to the given number are" + " " + arr[l] + " " + arr[r]);
                break;
            }
            else if(arr[l] + arr[r] < no)
            {
                l++;
            }
            else
            {
                r--;
            }
        }
        if(flag)
        {
            System.out.println("There are no two elements in the Array which sum up to the given number");
        }
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
        System.out.println("enter the element whose sum you have to find");
        int no = sc.nextInt();
        findElements(arr,n,no);
    }
}
