import java.util.*;
import java.util.Scanner;

public class AddMatrices {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns");
        int i = sc.nextInt();
        int j = sc.nextInt();
        int [][] first = new int[i][j];
        int[][] second = new int[i][j];
        int[][] res = new int[i][j];
        System.out.println("Enter the elements of the first matrix");
        for(int a=0; a<i; a++)
        {
            for(int b=0; b<j; b++)
            {
                first[a][b] = sc.nextInt();
            }
        }
        System.out.println("Enter the elements of the second matrix");
        for(int c=0; c<i; c++)
        {
            for(int d=0; d<j; d++)
            {
                second[c][d] = sc.nextInt();
            }
        }
        System.out.println("Adding the elements of the two matrices");
        for(int k=0; k<i; k++)
        {
            for(int l=0; l<j; l++)
            {
                res[k][l] = first[k][l] + second[k][l];
            }
        }
        System.out.println("Printing the resultant matrix");
        for(int x=0; x<i; x++)
        {
            for(int y=0; y<j; y++)
            {
                System.out.print(res[x][y] + " ");

            }
            System.out.println();
        }

    }
}
