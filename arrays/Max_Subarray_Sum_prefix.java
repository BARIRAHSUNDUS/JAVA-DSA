import java.util.*;

public class Max_Subarray_Sum_prefix {
  // function to create a prefix array:
  public static void Prefixarray(int num[]) {
    int n = num.length;
    int prefix_array[] = new int[n];
    prefix_array[0] = num[0];
    for (int i = 1; i < num.length; i++) {
      prefix_array[i] = prefix_array[i - 1] + num[i];
    }
    for (int i = 0; i < num.length; i++) {
      System.out.print(prefix_array[i] + " ");
    }
    max(prefix_array);
  }

  // function to find the max using the prefix array:
  public static void max(int num[]) {
    int max1 = Integer.MIN_VALUE;
    int sum = num[0];

    for (int i = 0; i < num.length; i++) {
      for (int j = i; j < num.length; j++) {
        if (i == 0) {
          sum = num[j];
        } else {
          sum = num[j] - num[i - 1];
        }
        if (sum > max1) {
          max1 = sum;
        }

      }

    }
    System.out.println("Max sum is: " + max1);
  }

  // main:
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value of n");
    int n = sc.nextInt();
    int num[] = new int[n];
    for (int i = 0; i < n; i++) {
      num[i] = sc.nextInt();
    }
    Prefixarray(num);
  }
}
