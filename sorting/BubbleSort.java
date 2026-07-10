public class BubbleSort {
  public static void main(String[] args) {
    int[] num = { 5, 4, 2, 1, 3 };

    // Outer loop:
    // Runs (n - 1) times because each pass fixes one element
    // at its correct position at the end of the array.
    for (int i = 0; i < num.length - 1; i++) {

      // Inner loop:
      // Compares adjacent elements only in the unsorted part.
      // The last i elements are already sorted.
      for (int j = 0; j < num.length - 1 - i; j++) {

        if (num[j] > num[j + 1]) {
          int temp = num[j];
          num[j] = num[j + 1];
          num[j + 1] = temp;
        }
      }
    }

    // Print sorted array
    for (int i = 0; i < num.length; i++) {
      System.out.print(num[i] + " ");
    }
  }
}