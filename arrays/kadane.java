import java.util.Scanner;

public class kadane {
  public static void KADANE(int num[]) {
    int sum = 0;
    int max = Integer.MIN_VALUE;

    for (int i = 0; i < num.length; i++) {
      sum += num[i];
      if (sum < 0) {
        sum = 0;
      }
      max = Math.max(sum, max);
    }
    if (max == 0) {
      max = num[0];
      for (int i = 0; i < num.length; i++) {
        if (num[i] > max)
          max = num[i];
      }

    }
    System.out.println("max is: " + max);
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value of n");
    int n = sc.nextInt();
    int num[] = new int[n];
    for (int i = 1; i < n; i++) {
      num[i] = sc.nextInt();
    }
    KADANE(num);
  }
}