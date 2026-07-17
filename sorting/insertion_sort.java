public class insertion_sort {
  public static void sorti(int nums[]) {
    int i, j;
    for (i = 1; i < nums.length; i++) {
      int key = nums[i];
      for (j = i - 1; j >= 0; j--) {
        if (key < nums[i]) {
          nums[j + 1] = nums[j];
        } else {
          break;
        }

      }
      nums[j + 1] = key;
    }
    for (i = 0; i < nums.length; i++) {
      System.out.print(nums[i]);
    }
  }

  public static void main(String args[]) {
    int nums[] = { 5, 4, 3, 1, 2 };
    sorti(nums);

  }

}
