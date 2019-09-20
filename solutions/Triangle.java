public class Main {
  public static void main(String[] args) {
    // length of triangle's base side (length of last row)
    int triangleSize = 19;

    for (int y = 1; y <= triangleSize; y += 2) {
      // amount of space left/right of triangle for this row
      int spaceSize = (triangleSize - y) / 2;

      // print space left of triangle
      for (int x = 0; x < spaceSize; x++) {
        System.out.print(" ");
      }

      // print triangle
      for (int x = 0; x < y; x++) {
        System.out.print("X");
      }

      // print space right of triangle
      for (int x = 0; x < spaceSize; x++) {
        System.out.print(" ");
      }

      System.out.println();
    }
  }
}
