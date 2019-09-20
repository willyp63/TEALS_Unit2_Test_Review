public class Main {
  public static void main(String[] args) {
    for (int y = 10; y > 0; y--) {
      for (int x = 0; x < y; x++) {
        System.out.print("X");
      }
      System.out.println();
    }

    // OR

    for (int y = 0; y < 10; y++) {
      for (int x = 0; x < (10 - y); x++) {
        System.out.print("X");
      }
      System.out.println();
    }
  }
}
