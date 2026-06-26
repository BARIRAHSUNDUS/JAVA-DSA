import java.util.*;
public class Subarray_Max_Sum_Brute_force
{
    public static void MaxSum(int num[])
    {
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < num.length; i++)
        {
            for(int j = i; j < num.length; j++)  
            {
                int sum = 0;
                for(int k = i; k <= j; k++)      
                {
                    sum = sum + num[k];
                }
                System.out.println(sum);
                if(sum >= max)
                {
                    max = sum;
                }
            }
        }
        System.out.println("maximum sum is: " + max);
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        int num[] = new int[n];
        for(int i = 0; i < n; i++)
        {
            num[i] = sc.nextInt();
        }
        MaxSum(num);
    }
}