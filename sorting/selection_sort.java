public class selection_sort {
  public static void selection(int num[]) {
    for (int i = 0; i < num.length - 1; i++) {
      int min_index = i;
      for (int j = i + 1; j < num.length; j++) {
        if (num[j] <= num[min_index]) {
          min_index = j;
        }
      }
      int temp = num[i];
      num[i] = num[min_index];
      num[min_index] = temp;

    }
    for (int i = 0; i < num.length; i++) {
      System.out.print(num[i]);
    }

  }

  public static void main(String args[]) {
    int num[] = { 5, 4, 3, 2, 1 };
    selection(num);
  }
}
