public class Main {
  public static void main(String[] args) {
    for (int y = 1; y <= 10; y++) {
      // the number of X's in this row
      int stepSize = y * 3;

      for (int x = 0; x < stepSize; x++) {
        System.out.print("X");
      }
      System.out.println();
    }
  }
}
