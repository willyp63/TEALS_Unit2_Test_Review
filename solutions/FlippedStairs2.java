public class Main {
  public static void main(String[] args) {
    int stairSize = 10;

    for (int y = 0; y < stairSize; y++) {
      // number of space characters for this row
      int spaceSize = stairSize - y - 1;

      // print space left of stairs
      for (int x = 0; x < spaceSize; x++) {
        System.out.print(" ");
      }

      // print stairs
      for (int x = spaceSize; x < stairSize; x++) {
        System.out.print("X");
      }

      System.out.println();
    }
  }
}
