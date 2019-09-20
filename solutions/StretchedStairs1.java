public class Main {
  public static void main(String[] args) {
    for (int y = 1; y <= 10; y++) {
      // triple the number of iterations by replacing y with (y * 3)
      for (int x = 0; x < (y * 3); x++) {
        System.out.print("X");
      }
      System.out.println();
    }
  }
}
