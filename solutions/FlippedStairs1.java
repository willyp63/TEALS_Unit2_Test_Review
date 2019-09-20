public class Main {
  public static void main(String[] args) {
    // reverse the direction of our loop
    // instead of going from 0 to 9, we now go from 9 to 0
    for (int y = 10 - 1; y >= 0; y--) {
      for (int x = 0; x <= y; x++) {
        System.out.print("X");
      }
      System.out.println();
    }

    // OR

    // same thing except we are doing the reversing in our inner loop by replacing y with (10 - y)
    for (int y = 0; y < 10; y++) {
      for (int x = 0; x < (10 - y); x++) {
        System.out.print("X");
      }
      System.out.println();
    }
  }
}
