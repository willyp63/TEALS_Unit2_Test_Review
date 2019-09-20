public class Main {
  public static void main(String[] args) {
    for (int y = 0; y < 10; y++) {
      // repeat our inner loop 3 times
      for (int i = 0; i < 3; i++) {
        for (int x = 0; x <= y; x++) {
          System.out.print("X");
        }
        System.out.println();
      }
    }

    // OR

    for (int y = 0; y < (10 * 3); y++) {
      // think about how integer division works and
      // why this gives the same result as the other solution
      for (int x = 0; x <= (y / 3); x++) {
        System.out.print("X");
      }
      System.out.println();
    }
  }
}
