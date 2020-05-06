import java.util.*;
import java.util.Scanner;
public class RearrangeArray {
    public static void rearrangeElements(int[] arr, int n)
    {
        Arrays.sort(arr);
        int[] temp = new int[n];
        boolean flag = true;
        int small = 0;
        int large = n - 1;
        for(int j=0; j<n; j++)
        {
            if(flag)
            {
                temp[j] = arr[large--];
            }
            else
            {
                temp[j] = arr[small++];
            }
            flag = !flag;
        }
        System.out.println("The Rearranged elements are ");
        for(int k=0; k<n; k++)
        {
            System.out.print(temp[k] + " ");
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
            rearrangeElements(arr,n);
        }
    }

